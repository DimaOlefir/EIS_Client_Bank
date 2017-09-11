package com.eisgroup.cb.model;

/**
 * Created by Titarenko on 06.06.2017 at 20:58.
 */
public enum Status {
    ACTIVE("Active"),
    INACTIVE("Inactive"),
    BLOCKED("Blocked");

    private final String name;

    Status(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}