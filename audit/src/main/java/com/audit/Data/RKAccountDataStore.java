package com.audit.Data;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class RKAccountDataStore {

    public ArrayList<RKAccountDataRecord> records = new ArrayList<RKAccountDataRecord>();

    public RKAccountDataStore() {
 
        String path = System.getProperty("user.dir")+"/API_ACCOUNT.json";
        System.out.println("Path: " + path);
        this.readJsonFile(path);
    }

    public void readJsonFile(String filePath) {
        JSONParser parser = new JSONParser();
        
        this.records = new ArrayList<RKAccountDataRecord>();
        JSONArray a;

        try {
            a = (JSONArray) parser.parse(new FileReader(filePath));
            for (Object o : a)
            {
              JSONObject account = (JSONObject) o;
          
                Double balance = (Double) account.get(APIAttribute.BALANCE.toString());
          
                RKAccountDataRecord record = new RKAccountDataRecord();
                record.balance = balance.toString();

                record.accountNumber = (String) account.get(APIAttribute.ACCOUNT_NUMBER.toString());
                record.planNumber = (String) account.get(APIAttribute.PLAN_NUMBER.toString());
                record.accountStatus = (String) account.get(APIAttribute.ACCOUNT_STATUS.toString());
                record.serviceCode = (String) account.get(APIAttribute.SERVICE.toString());
                record.firstName = (String) account.get(APIAttribute.FIRST_NAME.toString());
                record.lastName = (String) account.get(APIAttribute.LAST_NAME.toString());  
                record.suffix = (String) account.get(APIAttribute.SUFFIX.toString());
                record.gender = (String) account.get(APIAttribute.GENDER.toString());
                record.dob = (String) account.get(APIAttribute.DOB.toString());
                record.ssn = (String) account.get(APIAttribute.SSN.toString());
                record.maritalStatus = (String) account.get(APIAttribute.MARITAL_STATUS.toString());   
                record.citizenship = (String) account.get(APIAttribute.CITIZENSHIP.toString());
                record.email = (String) account.get(APIAttribute.EMAIL.toString());
                record.primaryPhone = (String) account.get(APIAttribute.PRIMARY_PHONE.toString());
                record.primaryPhoneType = (String) account.get(APIAttribute.PRIMARY_PHONE_TYPE.toString());
                record.address1 = (String) account.get(APIAttribute.ADDRESS1.toString());
                record.address2 = (String) account.get(APIAttribute.ADDRESS2.toString());
                record.city = (String) account.get(APIAttribute.CITY.toString());
                record.state = (String) account.get(APIAttribute.STATE.toString());
                record.zip = (String) account.get(APIAttribute.ZIP.toString());
                record.country = (String) account.get(APIAttribute.COUNTRY.toString());
                record.mothersMaidenName = (String) account.get(APIAttribute.MOTHERS_MAIDEN_NAME.toString());
                record.primBeneEntity = (String) account.get(APIAttribute.PRIM_BENE_ENTITY.toString());
                record.primBeneRelationship = (String) account.get(APIAttribute.PRIM_BENE_RELATIONSHIP.toString());
                record.primBeneFirstName = (String) account.get(APIAttribute.PRIM_BENE_FIRST_NAME.toString());
                record.primBeneLastName = (String) account.get(APIAttribute.PRIM_BENE_LAST_NAME.toString());
                record.primBeneSuffix = (String) account.get(APIAttribute.PRIM_BENE_SUFFIX.toString());
                record.primBeneGender = (String) account.get(APIAttribute.PRIM_BENE_GENDER.toString());
                record.primBeneDob = (String) account.get(APIAttribute.PRIM_BENE_DOB.toString());
                record.primBeneSsn = (String) account.get(APIAttribute.PRIM_BENE_SSN.toString());
                record.primBenePhone = (String) account.get(APIAttribute.PRIM_BENE_PHONE.toString());
                Double percent = (Double) account.get(APIAttribute.PRIM_BENE_PERCENTAGE.toString());
                record.primBenePercentage = percent.toString();
                record.primBeneAddress1 = (String) account.get(APIAttribute.PRIM_BENE_ADDRESS1.toString());
                record.primBeneCity = (String) account.get(APIAttribute.PRIM_BENE_CITY.toString());
                record.primBeneState = (String) account.get(APIAttribute.PRIM_BENE_STATE.toString());
                record.primBeneZip = (String) account.get(APIAttribute.PRIM_BENE_ZIP.toString());
                record.cntgBeneEntity = (String) account.get(APIAttribute.CNTG_BENE_ENTITY.toString());

                record.cntgBeneRelationship = (String) account.get(APIAttribute.CNTG_BENE_RELATIONSHIP.toString());
                record.cntgBeneFirstName = (String) account.get(APIAttribute.CNTG_BENE_FIRST_NAME.toString());
                record.cntgBeneLastName = (String) account.get(APIAttribute.CNTG_BENE_LAST_NAME.toString());
                record.cntgBeneSuffix = (String) account.get(APIAttribute.CNTG_BENE_SUFFIX.toString());
                record.cntgBeneGender = (String) account.get(APIAttribute.CNTG_BENE_GENDER.toString());
                record.cntgBeneDob = (String) account.get(APIAttribute.CNTG_BENE_DOB.toString());
                record.cntgBeneSsn = (String) account.get(APIAttribute.CNTG_BENE_SSN.toString());
                record.cntgBenePhone = (String) account.get(APIAttribute.CNTG_BENE_PHONE.toString());
                percent = (Double) account.get(APIAttribute.CNTG_BENE_PERCENTAGE.toString());
                record.cntgBenePercentage = (String) percent.toString();
                record.cntgBeneAddress1 = (String) account.get(APIAttribute.CNTG_BENE_ADDRESS1.toString());
                record.cntgBeneCity = (String) account.get(APIAttribute.CNTG_BENE_CITY.toString());
                record.cntgBeneState = (String) account.get(APIAttribute.CNTG_BENE_STATE.toString());
                record.cntgBeneZip = (String) account.get(APIAttribute.CNTG_BENE_ZIP.toString());
                record.eDelivery = (String) account.get(APIAttribute.EMAIL_DELIVERY.toString());

                this.records.add(record);
            }
        } catch (IOException | ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

     
    }

    public RKAccountDataRecord getAccountDataRecord(APIActivityRecord  apiActivityRecord)
    {
        for (RKAccountDataRecord record : this.records) {
            if (record.accountNumber.equals(apiActivityRecord.getAttribute(APIAttribute.ACCOUNT_NUMBER))) {
                return record;
            }
        }
        return  null;
    }
    
}
