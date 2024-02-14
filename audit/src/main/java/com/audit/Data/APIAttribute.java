package com.audit.Data;

public enum APIAttribute {
    FIRST_NAME("first_name"),
    LAST_NAME("last_name"),
    EMAIL("email");

    @SuppressWarnings("unused")
    private String value;

    private APIAttribute(String value) {
        this.value = value;
    }
}
