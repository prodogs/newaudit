package com.audit.Tests;

import java.util.ArrayList;

import com.audit.Data.APIAttribute;
 
class AuditExceptionRecord {

    APIAttribute attribute;
    String category;
    String message;

    public AuditExceptionRecord(APIAttribute attribute, AuditExceptionCategory category, String message) {
        this.attribute= attribute;
         this.message = message;
    }
    
}

public class AuditExceptionCategories {
    
    public static ArrayList<AuditExceptionRecord> auditExceptions = new ArrayList<AuditExceptionRecord>();
    
    public  AuditExceptionCategories() {

    
    }

}
