/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.acme.rest.json;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.apache.camel.Exchange;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * Camel route definitions.
 */
@ApplicationScoped
public class Routes extends RouteBuilder {
    Map aggregatedResult = new HashMap<String, String>();

    @Inject
    @Produce("direct:start")
    ProducerTemplate producer;

    @ConfigProperty(name = "sf.accessToken")
    String accesstoken;

    @ConfigProperty(name = "sf-uri")
    String uri;

    @ConfigProperty(name = "sf.lineitems-query")
    String lineitemsQuery;

    @ConfigProperty(name = "sf.account-query")
    String accountQuery;

    public Routes() {

    }

    @Override
    public void configure() throws Exception {

        restConfiguration().bindingMode(RestBindingMode.json);

        rest("/opportunities")

                .post()
                .type(LinkedHashMap.class)
                .route()
                .process(exchange -> {
                    LinkedHashMap opp = (LinkedHashMap) exchange.getIn().getBody();
                    if (opp != null)
                        processMap(opp);
                    processMap(opp);
                    System.out.println("Result aggregated after /POST " + aggregatedResult.toString());
                })

                .to("direct:start")
                .endRest();

        String opportunityId = (String) aggregatedResult.get("Id");

        //HTTPClient to query Account, Line items from Salesforce

        from("direct:start")

                .setHeader(Exchange.HTTP_URI, simple(uri))
                .setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
                .setHeader(Exchange.HTTP_METHOD, constant("GET"))

                .setHeader("Authorization", constant(accesstoken))
                //.to(uri + "query/?q=&" + lineitemsQuery + opportunityId + "'")
                .process(exchange -> {

                    LinkedHashMap opp = (LinkedHashMap) exchange.getIn().getBody();
                    if (opp != null)
                        processMap(opp);
                    //System.out.println("Result aggregated after /GET1 " + aggregatedResult.toString());

                }).to("direct:route3").end();

        String accountId = (String) aggregatedResult.get("AccountId");

        from("direct:route3")

                .setHeader(Exchange.HTTP_URI, simple(uri))
                .setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
                .setHeader(Exchange.HTTP_METHOD, constant("GET")).setHeader("Authorization", constant(accesstoken))
                // .to(uri+"query/?q=&"+laccountQuery + accountId + "'")

                .process(exchange -> {

                    LinkedHashMap opp = (LinkedHashMap) exchange.getIn().getBody();
                    if (opp != null)
                        processMap(opp);
                    //System.out.println("Result aggregated after /GET2 " + aggregatedResult.toString());

                }).log("body -->${body}").end();

    }

    private void processList(List values) {

        for (Object value : values) {
            if (value instanceof String) {
                aggregatedResult.put(value.toString().substring(0, value.toString().indexOf('=')).trim(),
                        value.toString().substring(value.toString().indexOf('=')));
            } else if (value instanceof List) {
                List<String> subList = (ArrayList<String>) value;
                processList(subList);
            } else if (value instanceof Map) {
                Map<String, Object> subMap = (Map<String, Object>) value;
                try {
                    processMap(subMap);
                } catch (ParseException e) {
                    System.out.println(e.getMessage());

                }
            }

        }

    }

    private void processMap(Map<String, Object> lhm1) throws ParseException {
        for (Map.Entry<String, Object> entry : lhm1.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                aggregatedResult.put(key, value);
            } else if (value instanceof Map) {
                Map<String, Object> subMap = (Map<String, Object>) value;
                processMap(subMap);
            } else if (value instanceof List) {
                List<String> subList = (ArrayList<String>) value;
                processList(subList);

            }
        }
    }

}
