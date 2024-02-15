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
    PRIM_BENE_PERCENT("prim_bene_percent"), 
    PRIM_BENE_ADDRESS1("prim_bene_address1"), 
    PRIM_BENE_CITY("prim_bene_city"), 
    PRIM_BENE_STATE("prim_bene_state"), 
    PRIM_BENE_ZIP_CODE("prim_bene_zip_code"), 
    CTG_BENE_ENTITY("ctg_bene_entity"), 
    CTG_BENE_RELATIONSHIP("ctg_bene_relationship"), 
    CTG_BENE_FIRST_NAME("ctg_bene_first_name"), 
    CTG_BENE_LAST_NAME("ctg_bene_last_name"),
    CTG_BENE_SUFFIX("ctg_bene_suffix"), 
    CTG_BENE_GENDER("ctg_bene_gender"), 
    CTG_BENE_DOB("ctg_bene_dob"), 
    CTG_BENE_SSN("ctg_bene_ssn"), 
    CTG_BENE_PHONE("ctg_bene_phone"), 
    CTG_BENE_PERCENT("ctg_bene_percent"), 
    CTG_BENE_ADDRESS1("ctg_bene_address1"), 
    CTG_BENE_CITY("ctg_bene_city"), 
    CTG_BENE_STATE("ctg_bene_state"), 
    CTG_BENE_ZIP_CODE("ctg_bene_zip_code"), 
    EMAIL_PREFERENCE("email_preference"), 
    CTG_BENE_GENGER("ctg_bene_genger"); // Fixed typo in enum constant name

    private String value;

    private APIAttribute(String value) {
        this.value = value;
    }
}
