package com.audit.Tests;

import java.util.ArrayList;

class AuditExceptionRecord {
    AuditExceptionCategory category;
    String message;

    public AuditExceptionRecord(AuditExceptionCategory category, String message) {
        this.category = category;
        this.message = message;
    }
    
}

public class AuditExceptionCategories {
    
    public static ArrayList<AuditExceptionRecord> auditExceptions = new ArrayList<AuditExceptionRecord>();
    public  AuditExceptionCategories() {

        auditExceptions.add(new AuditExceptionRecord(
        AuditExceptionCategory.MSG_ACCOUNT_NUMBER_MISMATCH,"MSG_ACCOUNT_NUMBER_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_SSN_MISMATCH,"MSG_SSN_MISMATCH"));  
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_MARITAL_STATUS_MISMATCH, "MSG_MARITAL_STATUS_MISMATCH"));   
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_ADDRESS_LINE_1_MISMATCH, "MSG_ADDRESS_LINE_1_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_ADDRESS_LINE_2_MISMATCH, "MSG_ADDRESS_LINE_2_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_CITY_MISMATCH, "MSG_CITY_MISMATCH"));   
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_STATE_MISMATCH, "MSG_STATE_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_ZIP_CODE_MISMATCH, "MSG_ZIP_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_COUNTRY_MISMATCH, "MSG_ZIP_CODE_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_PRIMARY_PHONE_NUMBER_MISMATCH, "MSG_PRIMARY_PHONE_NUMBER_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_PRIMARY_PHONE_NUMBER_TYPE_MISMATCH, "MSG_PRIMARY_PHONE_NUMBER_TYPE_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_DOB_MISMATCH, "MSG_DOB_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_GENDER_MISMATCH, "MSG_GENDER_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_EMAIL_ADDRESS_MISMATCH, "MSG_EMAIL_ADDRESS_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_PLAN_NUMBER_MISMATCH, "MSG_PLAN_NUMBER_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_FIRST_NM_MISMATCH, "MSG_FIRST_NM_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_LAST_NM_MISMATCH, "MSG_LAST_NM_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_NAME_SFFX, "MSG_NAME_SFFX"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_CITIZENSHIP_MISMATCH, "MSG_CITIZENSHIP_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_CITIZENSHIP_NOT_US, "MSG_CITIZENSHIP_NOT_US"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_COUNTRY_NOT_US, "MSG_COUNTRY_NOT_US"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_MOTHERS_MAIDEN_NAME_MISMATCH, "MSG_MOTHERS_MAIDEN_NAME_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_PRIM_BENE_ENTITY_MISMATCH, "MSG_PRIM_BENE_ENTITY_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_PRIM_BENE_RELATIONSHIP_MISMATCH, "MSG_PRIM_BENE_RELATIONSHIP_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_PRIM_BENE_FIRST_NAME_MISMATCH, "MSG_PRIM_BENE_FIRST_NAME_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_PRIM_BENE_LAST_NAME_MISMATCH, "MSG_PRIM_BENE_LAST_NAME_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_PRIM_BENE_SUFFIX_MISMATCH, "MSG_PRIM_BENE_SUFFIX_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_PRIM_BENE_GENDER_MISMATCH, "MSG_PRIM_BENE_GENDER_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_PRIM_BENE_DOB_MISMATCH, "MSG_PRIM_BENE_DOB_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_PRIM_BENE_SSN_MISMATCH, "MSG_PRIM_BENE_SSN_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_PRIM_BENE_PHONE_NUMBER_MISMATCH, "MSG_PRIM_BENE_PHONE_NUMBER_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_PRIM_BENE_PERCENTAGE_MISMATCH, "MSG_PRIM_BENE_PERCENTAGE_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_PRIM_BENE_ADDRESS_LINE_1_MISMATCH, "MSG_PRIM_BENE_ADDRESS_LINE_1_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_PRIM_BENE_CITY_MISMATCH, "MSG_PRIM_BENE_CITY_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_PRIM_BENE_STATE_MISMATCH, "MSG_PRIM_BENE_STATE_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_PRIM_BENE_ZIP_MISMATCH, "MSG_PRIM_BENE_ZIP_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_CNTG_BENE_ENTITY_MISMATCH, "MSG_CNTG_BENE_ENTITY_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_CNTG_BENE_RELATIONSHIP_MISMATCH, "MSG_CNTG_BENE_RELATIONSHIP_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_CNTG_BENE_FIRST_NAME_MISMATCH, "MSG_CNTG_BENE_FIRST_NAME_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_CNTG_BENE_LAST_NAME_MISMATCH, "MSG_CNTG_BENE_LAST_NAME_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_CNTG_BENE_SUFFIX_MISMATCH, "MSG_CNTG_BENE_SUFFIX_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_CNTG_BENE_GENDER_MISMATCH, "MSG_CNTG_BENE_GENDER_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_CNTG_BENE_DOB_MISMATCH, "MSG_CNTG_BENE_DOB_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_CNTG_BENE_SSN_MISMATCH, "MSG_CNTG_BENE_SSN_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_CNTG_BENE_PHONE_NUMBER_MISMATCH, "MSG_CNTG_BENE_PHONE_NUMBER_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_CNTG_BENE_PERCENTAGE_MISMATCH, "MSG_CNTG_BENE_PERCENTAGE_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_CNTG_BENE_ADDRESS_LINE_1_MISMATCH, "MSG_CNTG_BENE_ADDRESS_LINE_1_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_CNTG_BENE_CITY_MISMATCH, "MSG_CNTG_BENE_CITY_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_CNTG_BENE_STATE_MISMATCH, "MSG_CNTG_BENE_STATE_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_CNTG_BENE_ZIP_CODE_MISMATCH, "MSG_CNTG_BENE_ZIP_CODE_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_TPP_IRA_NOT_SUBSCRIBED, "MSG_TPP_IRA_NOT_SUBSCRIBED"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_TPP_IRA_NOT_SUBSCRIBED_WITH_BALANCE, "MSG_TPP_IRA_NOT_SUBSCRIBED_WITH_BALANCE"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_TPP_IRA_AWD_NO_FORMS, "MSG_TPP_IRA_AWD_NO_FORMS"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_EDELIVERY_SELECTION_MISMATCH, "MSG_EDELIVERY_SELECTION_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_FUND_DESC_CODE_PERCENT_MISMATCH, "MSG_FUND_DESC_CODE_PERCENT_MISMATCH"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_FUND_DESC_NOT_AVAILABLE, "MSG_FUND_DESC_NOT_AVAILABLE"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_FUND_ALLOCATION_PERCENT_TOTAL_OVER_100, "MSG_FUND_ALLOCATION_PERCENT_TOTAL_OVER_100"));
        auditExceptions.add(new AuditExceptionRecord(AuditExceptionCategory.MSG_FUND_ALLOCATION_PERCENT_TOTAL_UNDER_100, "MSG_FUND_ALLOCATION_PERCENT_TOTAL_UNDER_100"));
    }
        
    public static String getAuditExceptionMessage(AuditExceptionCategory category) {
        for (AuditExceptionRecord auditExceptionRecord : auditExceptions) {
            if (auditExceptionRecord.category == category) {
                return auditExceptionRecord.message;
            }
        }
        return null;
    }  
}
