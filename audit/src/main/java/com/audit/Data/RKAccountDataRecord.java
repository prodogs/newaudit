package com.audit.Data;


public class RKAccountDataRecord {

    public APICallType apiCallType;
    public String timeStamp;
    public String externalParty;
    public String jsonPackage;

    public String getPackageAttribute() {
        return "";
    }

    public APICallType getCallType() {
        return APICallType.ALLOCATION_MODEL;
    }
    public String getPlanNumber() {
        return "";
    }

    public String getAccountNumber() {
        return "";
    }
    public String getTPPServiceSubscription() {
        return "";
    }

    public String getEDeliveryPreference() {
        return "";
    }   

    public Boolean hasBalance() {
        return false;
    }
    public String getSSN() {
        return "";
    }   
    public String getCountry() {
        return "";
    }
    public String getCitizenship() {
        return  "";
    }

    public String getFirstName() {
        return "";
    }   
    public String getLastName() {
        return "";
    }   
    public String getSuffix() {
        return "";
    }   
    public String getGender() {
        return "";
    }   
    public String DOB() {
        return "";
    }   
    public String getMaritalStatus() {
        return "";
    }   
    public String getEmail() {
        return "";
    }   
    public String primaryPhoneNumber() {
        return "";
    }   

    public String secondaryPhoneNumber() {
        return "";
    }

    public String getAttribute(APIAttribute attribute) {
        return "";
    }

}
