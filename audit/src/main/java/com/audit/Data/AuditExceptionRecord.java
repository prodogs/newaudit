package com.audit.Data;

public class AuditExceptionRecord {

    public String attribute;
    public String category;
    public String description;
    public String reason;
    public String combine_description;

    public AuditExceptionRecord(String attribute, String category, String description, String reason, String combine_description) {
        this.attribute = attribute;
        this.category = category;
        this.description = description;
        this.reason = reason;
        this.combine_description = combine_description;
    }
    
}