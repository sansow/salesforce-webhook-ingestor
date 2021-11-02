package org.acme.rest.json;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonRootName("")
public class ResponseData {

    Map<Long, Double> resultMap;

    public ResponseData(Map<Long, Double> resultMap) {
        this.resultMap = resultMap;
    }

    public ResponseData() {
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
