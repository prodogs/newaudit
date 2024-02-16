package com.audit.Data;

public enum APIAttribute {
    FIRST_NAME("first_name"),
    LAST_NAME("last_name"),
    EMAIL("email"), 
    DOB("dob"), 
    SSN("ssn"), 
    CITIZENSHIP("citizenship"),
    COUNTRY("country"),
    MARITAL_STATUS("marital_status"),
    GENDER("gender"), 
    PRIMARY_PHONE("primary_phone"), 
    ADDRESS1("address1"), 
    ADDRESS2("address2"), 
    CITY("city"), 
    STATE("state"),
    ZIP_CODE("zip_code"), 
    PLAN_NUMBER("plan_number"), 
    SUFFIX("suffix"), 
    PRIMARY_PHONE_TYPE("primary_phone_type"), 
    MOTHERS_MAIDEN_NAME("mothers_maiden_name"),
    PRIM_BENE_ENTITY("prim_bene_entity"), 
    PRIM_BENE_RELATIONSHIP("prim_bene_relationship"), 
    PRIM_BENE_LAST_NAME("prim_bene_last_name"), 
    PRIM_BENE_FIRST_NAME("prim_bene_first_name"), 
    PRIM_BENE_SUFFIX("prim_bene_suffix"), 
    PRIM_BENE_GENDER("prim_bene_gender"), 
    PRIM_BENE_DOB("prim_bene_dob"), 
    PRIM_BENE_SSN("prim_bene_ssn"), 
    PRIM_BENE_PHONE("prim_bene_phone"), 
    PRIM_BENE_ADDRESS1("prim_bene_address1"), 
    PRIM_BENE_CITY("prim_bene_city"), 
    PRIM_BENE_STATE("prim_bene_state"),  
    EMAIL_PREFERENCE("email_preference"), 
    CTG_BENE_GENGER("ctg_bene_genger"),
    ACCOUNT_STATUS("account_status"), 
    BALANCE("balance"), 
    PRIM_BENE_PERCENTAGE("prim_bene_percentage"), 
    PRIM_BENE_ZIP("prim_bene_zip"), 
    CNTG_BENE_ENTITY("cntg_bene_entity"), 
    CNTG_BENE_RELATIONSHIP("cntg_bene_relationship"), 
    CNTG_BENE_FIRST_NAME("cntg_bene_first_name"), 
    CNTG_BENE_LAST_NAME("cntg_bene_last_name"), 
    CNTG_BENE_SUFFIX("cntg_bene_suffix"), 
    CNTG_BENE_GENDER("cntg_bene_gender"), 
    CNTG_BENE_DOB("cntg_bene_dob"), 
    CNTG_BENE_SSN("cntg_bene_ssn"), 
    CNTG_BENE_PHONE("cntg_bene_phone"), 
    CNTG_BENE_PERCENTAGE("cntg_bene_percentage"), 
    CNTG_BENE_ADDRESS1("cntg_bene_address1"), 
    CNTG_BENE_CITY("cntg_bene_city"), 
    CNTG_BENE_STATE("cntg_bene_state"), 
    CNTG_BENE_ZIP("cntg_bene_zip"), 
    E_DELIVERY("e_delivery");


    // Fixed typo in enum constant name

    private String value;

    private APIAttribute(String value) {
        this.value = value;
    }
}
