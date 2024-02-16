package com.audit.Tests;

import com.audit.AppConfig;
import com.audit.Data.APIActivityRecord;
import com.audit.Data.APIAttribute;
import com.audit.Data.ExceptionMessages;
import com.audit.Data.RKAccountDataRecord;
import com.audit.Reports.AccountOpenAuditReportRecord;
import com.audit.Data.AuditExceptionRecord;

public class ProcessAccountRKToAPITests {
    
    public RKAccountDataRecord accountDataRecord ;   
    public APIActivityRecord apiActivityRecord ;
    public AppConfig appConfig;

    public ProcessAccountRKToAPITests( AppConfig appConfig, APIActivityRecord apiActivityRecord) {

        this.apiActivityRecord = apiActivityRecord;
        this.run();
    }

    public Boolean run() {
        this.accountDataRecord = this.appConfig.rkDataStore.getAccountDataRecord(apiActivityRecord);

        if (this.accountDataRecord == null) {
            this.noRKDatafound();
            return false;
        }

        this.testAttribute(APIAttribute.PLAN_NUMBER);
        this.testAttribute(APIAttribute.FIRST_NAME);
        this.testAttribute(APIAttribute.LAST_NAME);
        this.testAttribute(APIAttribute.SUFFIX);
        this.testAttribute(APIAttribute.DOB);
        this.testAttribute(APIAttribute.SSN);
        this.testAttribute(APIAttribute.COUNTRY);
        this.testAttribute(APIAttribute.CITIZENSHIP);
        this.testAttribute(APIAttribute.MARITAL_STATUS);
        this.testAttribute(APIAttribute.CITIZENSHIP);
        // need not us citizen test
        this.testAttribute(APIAttribute.GENDER);
        this.testAttribute(APIAttribute.EMAIL);
        this.testAttribute(APIAttribute.PRIMARY_PHONE);
        this.testAttribute(APIAttribute.PRIMARY_PHONE_TYPE);
        this.testAttribute(APIAttribute.ADDRESS1);
        this.testAttribute(APIAttribute.ADDRESS2);
        this.testAttribute(APIAttribute.CITY);
        this.testAttribute(APIAttribute.STATE);
        this.testAttribute(APIAttribute.ZIP_CODE);
        this.testAttribute(APIAttribute.COUNTRY);
        // not us test
        this.testAttribute(APIAttribute.MOTHERS_MAIDEN_NAME);
        this.testAttribute(APIAttribute.PRIM_BENE_ENTITY);
        this.testAttribute(APIAttribute.PRIM_BENE_RELATIONSHIP);
        this.testAttribute(APIAttribute.PRIM_BENE_FIRST_NAME);
        this.testAttribute(APIAttribute.PRIM_BENE_LAST_NAME);
        this.testAttribute(APIAttribute.PRIM_BENE_SUFFIX);
        this.testAttribute(APIAttribute.PRIM_BENE_GENDER);
        this.testAttribute(APIAttribute.PRIM_BENE_DOB);
        this.testAttribute(APIAttribute.PRIM_BENE_SSN);
        this.testAttribute(APIAttribute.PRIM_BENE_PHONE);
        this.testAttribute(APIAttribute.PRIM_BENE_PERCENT);
        this.testAttribute(APIAttribute.PRIM_BENE_ADDRESS1);
        this.testAttribute(APIAttribute.PRIM_BENE_CITY);
        this.testAttribute(APIAttribute.PRIM_BENE_STATE);
        this.testAttribute(APIAttribute.PRIM_BENE_ZIP_CODE);
        this.testAttribute(APIAttribute.CTG_BENE_ENTITY);
        this.testAttribute(APIAttribute.CTG_BENE_RELATIONSHIP);
        this.testAttribute(APIAttribute.CTG_BENE_FIRST_NAME);
        this.testAttribute(APIAttribute.CTG_BENE_LAST_NAME);
        this.testAttribute(APIAttribute.CTG_BENE_SUFFIX);
        this.testAttribute(APIAttribute.CTG_BENE_GENGER);
        this.testAttribute(APIAttribute.CTG_BENE_DOB);
        this.testAttribute(APIAttribute.CTG_BENE_SSN);
        this.testAttribute(APIAttribute.CTG_BENE_PHONE);
        this.testAttribute(APIAttribute.CTG_BENE_PERCENT);
        this.testAttribute(APIAttribute.CTG_BENE_ADDRESS1);
        this.testAttribute(APIAttribute.CTG_BENE_CITY);
        this.testAttribute(APIAttribute.CTG_BENE_STATE);
        this.testAttribute(APIAttribute.CTG_BENE_ZIP_CODE);
        this.testAttribute(APIAttribute.EMAIL_PREFERENCE);
        // Test Subscription Type
        // Test No Service Subscription to TPP IRA with Balance


        return false;

    }

    public void mismatch(APIAttribute attribute, String rkValue, String apiValue) {

        AccountOpenAuditReportRecord accountOpenAuditReport = new AccountOpenAuditReportRecord();

        AuditExceptionRecord exception = ExceptionMessages.GetExceptionMessage(attribute.toString()); // Declare the variable 'exception'

        String details = String.format("API Value <%s> Different FROM RK<%s>", apiValue, rkValue);
        
        accountOpenAuditReport.field = attribute.toString();
        accountOpenAuditReport.exceptionCategory = exception.category;
        accountOpenAuditReport.exceptionReason = exception.reason;
        accountOpenAuditReport.exceptionDescription = exception.description;
        accountOpenAuditReport.combineExceptionsDescription = details;
        
        this.appConfig.accountOpenAuditReport.add(accountOpenAuditReport);

    }

    public Boolean testAttribute(APIAttribute attribute) {

        String rkValue = this.accountDataRecord.getAttribute(attribute);
        String apiValue = this.apiActivityRecord.getAttribute(attribute);

        if (this.accountDataRecord.getAttribute(attribute).equals(apiActivityRecord.getAttribute(attribute))) {
            return true;
        }
        
        this.mismatch(attribute,rkValue,apiValue);
        return false;

    }
    public void noRKDatafound() {
        
        AccountOpenAuditReportRecord accountOpenAuditReport = new AccountOpenAuditReportRecord();
        accountOpenAuditReport.noRKDatafound(this.apiActivityRecord);

        this.appConfig.accountOpenAuditReport.add(accountOpenAuditReport);
    }
 



}





