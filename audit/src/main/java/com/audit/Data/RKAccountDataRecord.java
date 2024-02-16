package com.audit.Data;


public class RKAccountDataRecord {

    public String balance;
    public String planNumber;
    public String accountStatus;
    public String serviceCode;
    public String firstName;
    public String lastName;
    public String suffix;
    public String gender;
    public String dob;
    public String ssn;
    public String maritalStatus;
    public String citizenship;
    public String email;
    public String primaryPhone;
    public String primaryPhoneType;
    public String address1;
    public String address2;
    public String city;
    public String state;
    public String zip;
    public String country;
    public String mothersMaidenName;
    public String primBeneEntity;
    public String primBeneRelationship;
    public String primBeneFirstName;
    public String primBeneLastName;
    public String primBeneSuffix;
    public String primBeneGender;
    public String primBeneDob;
    public String primBeneSsn;
    public String primBenePhone;
    public String primBenePercentage;
    public String primBeneAddress1;
    public String primBeneCity;
    public String primBeneState;
    public String primBeneZip;
    public String cntgBeneEntity;
    public String cntgBeneRelationship;
    public String cntgBeneFirstName;
    public String cntgBeneLastName;
    public String cntgBeneSuffix;
    public String cntgBeneGender;
    public String cntgBeneDob;
    public String cntgBeneSsn;
    public String cntgBenePhone;
    public String cntgBenePercentage;
    public String cntgBeneAddress1;
    public String cntgBeneCity;
    public String cntgBeneState;
    public String cntgBeneZip;
    public String eDelivery;

    public String getAttribute(APIAttribute attribute) {

        switch (attribute) {
        case BALANCE:
            return balance;
        case PLAN_NUMBER:
            return planNumber;
        case ACCOUNT_STATUS:
            return accountStatus;
        case FIRST_NAME:
            return firstName;
        case LAST_NAME:
            return lastName;
        case SUFFIX:
            return suffix;
        case GENDER:
            return gender;
        case DOB:
            return dob;
        case SSN:
            return ssn;
        case MARITAL_STATUS:
            return maritalStatus;
        case CITIZENSHIP:
            return citizenship;
        case EMAIL:
            return email;
        case PRIMARY_PHONE:
            return primaryPhone;
        case PRIMARY_PHONE_TYPE:
            return primaryPhoneType;
        case ADDRESS1:
            return address1;
        case ADDRESS2:
            return address2;
        case CITY:
            return city;
        case STATE:
            return state;
        case ZIP:
            return zip;
        case COUNTRY:
            return country;
        case MOTHERS_MAIDEN_NAME:
            return mothersMaidenName;
        case PRIM_BENE_ENTITY:
            return primBeneEntity;
        case PRIM_BENE_RELATIONSHIP:
            return primBeneRelationship;
        case PRIM_BENE_FIRST_NAME:
            return primBeneFirstName;
        case PRIM_BENE_LAST_NAME:
            return primBeneLastName;
        case PRIM_BENE_SUFFIX:
            return primBeneSuffix;
        case PRIM_BENE_GENDER:
            return primBeneGender;
        case PRIM_BENE_DOB:
            return primBeneDob;
        case PRIM_BENE_SSN:
            return primBeneSsn;
        case PRIM_BENE_PHONE:
            return primBenePhone;
        case PRIM_BENE_PERCENTAGE:
            return primBenePercentage;
        case PRIM_BENE_ADDRESS1:
            return primBeneAddress1;
        case PRIM_BENE_CITY:
            return primBeneCity;
        case PRIM_BENE_STATE:
            return primBeneState;
        case PRIM_BENE_ZIP:
            return primBeneZip;
        case CNTG_BENE_ENTITY:
            return cntgBeneEntity;
        case CNTG_BENE_RELATIONSHIP:
            return cntgBeneRelationship;
        case CNTG_BENE_FIRST_NAME:
            return cntgBeneFirstName;
        case CNTG_BENE_LAST_NAME:
            return cntgBeneLastName;
        case CNTG_BENE_SUFFIX:
            return cntgBeneSuffix;
        case CNTG_BENE_GENDER:
            return cntgBeneGender;
        case CNTG_BENE_DOB:
            return cntgBeneDob;
        case CNTG_BENE_SSN:
            return cntgBeneSsn;
        case CNTG_BENE_PHONE:
            return cntgBenePhone;
        case CNTG_BENE_PERCENTAGE:
            return cntgBenePercentage;
        case CNTG_BENE_ADDRESS1:
            return cntgBeneAddress1;
        case CNTG_BENE_CITY:
            return cntgBeneCity;
        case CNTG_BENE_STATE:
            return cntgBeneState;
        case CNTG_BENE_ZIP:
            return cntgBeneZip;
        case E_DELIVERY:
            return eDelivery;
        default:
            return null;
    }
}

    public Boolean isTPPSubscribed() {
        return this.serviceCode.equals("TPP");
    }

    public Boolean isTPPSubcribedWithBalance() {
        return Integer.parseInt(this.balance) == 0;
    }

}
