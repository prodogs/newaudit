package com.audit.Data;

import com.audit.Data.APIAttribute;

public enum APIAttribute {
    ID("id"),
    FIRST_NAME("first_name"),
    LAST_NAME("last_name"),
    EMAIL("email"), 
    DOB("dob"), 
    SSN("ssn"), 
    SERVICE("service"), 
    CITIZENSHIP("citizenship"),
    COUNTRY("country"),
    MARITAL_STATUS("marital_status"),
    GENDER("gender"), 
    PRIMARY_PHONE("primary_phone"), 
    ADDRESS1("address1"), 
    ADDRESS2("address2"), 
    CITY("city"), 
    STATE("state"),
    ZIP("zip"), 
    PLAN_NUMBER("plan_number"), 
    SUFFIX("suffix"), 
    PRIMARY_PHONE_TYPE("phone_type"), 
    MOTHERS_MAIDEN_NAME("mothers_maiden_name"),
    PRIM_BENE_ENTITY("primary_ben_person_entity"), 
    PRIM_BENE_RELATIONSHIP("primary_relationship"), 
    PRIM_BENE_LAST_NAME("primary_ben_last_name"), 
    PRIM_BENE_FIRST_NAME("primary_bene_first_name"), 
    PRIM_BENE_SUFFIX("primary_ben_suffix"), 
    PRIM_BENE_GENDER("primary_ben_gender"), 
    PRIM_BENE_DOB("primary_ben_dobob"), 
    PRIM_BENE_SSN("primary_ben_ssn"), 
    PRIM_BENE_PHONE("primary_ben_phone"), 
    PRIM_BENE_ADDRESS1("primary_ben_address1"), 
    PRIM_BENE_CITY("primary_ben_city"), 
    PRIM_BENE_STATE("primary_ben_city"),  // change back to primary_ben_state
    ACCOUNT_STATUS("account_status"), 
    BALANCE("balance"), 
    PRIM_BENE_PERCENTAGE("primary_ben_percent"), 
    PRIM_BENE_ZIP("primary_ben_zip"), 
    CNTG_BENE_ENTITY("cntg_ben_person_e"), 
    CNTG_BENE_RELATIONSHIP("cntg_ben_relationship"), 
    CNTG_BENE_FIRST_NAME("cntg_ben_first"), 
    CNTG_BENE_LAST_NAME("cntg_ben_kast"), 
    CNTG_BENE_SUFFIX("cntg_ben_suffix"), 
    CNTG_BENE_GENDER("cntg_ben_gender"), 
    CNTG_BENE_DOB("cntg_ben_dob"), 
    CNTG_BENE_SSN("cntg_ben_ssn"), 
    CNTG_BENE_PHONE("cntg_ben_primary_phone"), 
    CNTG_BENE_PERCENTAGE("cntg_ben_percent"), 
    CNTG_BENE_ADDRESS1("cntg_ben_address1"), 
    CNTG_BENE_CITY("cntg_ben_city"), 
    CNTG_BENE_STATE("cntg_ben_state"), 
    CNTG_BENE_ZIP("cntg_ben_zip"), 
    EMAIL_DELIVERY("e_delivery"),
    TPA_NOT_SUBSCRIBED("tpa_ira_not_subscribed"),
    TPA_NOT_SUBSCRIBED_WITH_BALANCE("tpa_ira_not_subscribed_with_balance"), 
    ACCOUNT_NUMBER("plan_number"), // change back t account_number
    FUTURE_ALLOCATION_ID("id"),
    FUTURE_ALLOCATION_FUND_CODE("fund_name"),
    FUTURE_ALLOCATION_FUND_PERCENT("fund_percent"),
    FUTURE_ALLOCATION_GREATER_100("greater_than_100"),
    FUTURE_ALLOCATION_LESS_100("less_than_100"),
    FUTURE_ALLOCATION_FUND_PERCENT_MISMATCH("fund_code_percent_mismatch"),
    FUTURE_ALLOCATION_FUND_DESC_NOT_AVAIL("fund_desc_not_avail"),
    FUTURE_ALLOCATION_FAILURE("allocation_transaction_failure"),
    NO_ACCOUNT_BALANCE_OVER_3_MONTHS("no_account_balance_over_3_months"),
    REBALANCE_FUND_TOTAL_INCORRECT_PERCENT("rebalaced_fund_total_incorrect_percent"),
    REBALANCE_FAILED_UNKNOWN( "rebalance_failed_unkown"),
    REBALANCED_FAILED_KNOWN("rebalanced_failed_known"),;

    // Fixed typo in enum constant name

    private String value;

    private APIAttribute(String value) {
        this.value = value.toLowerCase();
    }
    
    public String toString() {
        return this.value.toLowerCase();
    }
    private APIAttribute() {
        // Empty constructor
    }
}
