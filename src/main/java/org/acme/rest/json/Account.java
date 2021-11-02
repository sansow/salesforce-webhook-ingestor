package org.acme.rest.json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1

public class Account {
    public List<RecentItem> recentItems;
}

class RecentItem {
    public Attributes attributes;
    @JsonProperty("Id")
    public String id;
    @JsonProperty("Name")
    public String name;
}
