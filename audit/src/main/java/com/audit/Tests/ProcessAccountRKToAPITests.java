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
        this.appConfig = appConfig; ;
        this.run();
    }

    public void run() {

        this.accountDataRecord = this.appConfig.rkDataStore.getAccountDataRecord(apiActivityRecord);

      //  if (this.accountDataRecord == null) {
       //     this.noRKDatafound();
      //      return;
      //  }
 

        //System.out.println("Account Data Record: " + this.accountDataRecord.accountNumber);
        this.testIsTPPAccount();

        this.testIsTPPAccountWithBalance();
     
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
        this.testAttribute(APIAttribute.ZIP);
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
      
        this.testAttribute(APIAttribute.PRIM_BENE_PERCENTAGE);
        this.testAttribute(APIAttribute.PRIM_BENE_ADDRESS1);
        this.testAttribute(APIAttribute.PRIM_BENE_CITY);
        this.testAttribute(APIAttribute.PRIM_BENE_STATE);
        this.testAttribute(APIAttribute.PRIM_BENE_ZIP);
        this.testAttribute(APIAttribute.CNTG_BENE_ENTITY);
        this.testAttribute(APIAttribute.CNTG_BENE_RELATIONSHIP);
        this.testAttribute(APIAttribute.CNTG_BENE_FIRST_NAME);
        this.testAttribute(APIAttribute.CNTG_BENE_LAST_NAME);
        this.testAttribute(APIAttribute.CNTG_BENE_SUFFIX);
        this.testAttribute(APIAttribute.CNTG_BENE_GENDER);
        this.testAttribute(APIAttribute.CNTG_BENE_DOB);
        this.testAttribute(APIAttribute.CNTG_BENE_SSN);
        this.testAttribute(APIAttribute.CNTG_BENE_PHONE);
        this.testAttribute(APIAttribute.CNTG_BENE_PERCENTAGE);
        this.testAttribute(APIAttribute.CNTG_BENE_ADDRESS1);
        this.testAttribute(APIAttribute.CNTG_BENE_CITY);
        this.testAttribute(APIAttribute.CNTG_BENE_STATE);
        this.testAttribute(APIAttribute.CNTG_BENE_ZIP);
        this.testAttribute(APIAttribute.EMAIL_DELIVERY);

        return ;

    }

    public void mismatch(APIAttribute attribute, String message) {

        System.out.println("Mismatch found for " + attribute.toString() + " " + message);
        AccountOpenAuditReportRecord accountOpenAuditReport = new AccountOpenAuditReportRecord();

        AuditExceptionRecord exception = ExceptionMessages.GetExceptionMessage(attribute.toString()); // Declare the variable 'exception'

        if (exception == null) {
            System.out.println("Exception not found for " + attribute.toString());
        }

        String details = message;
        
        accountOpenAuditReport.field = attribute.toString();
        accountOpenAuditReport.exceptionCategory = exception.category;
        accountOpenAuditReport.exceptionReason = exception.reason;
        accountOpenAuditReport.exceptionDescription = exception.description;
        accountOpenAuditReport.combineExceptionsDescription = details;
        
        this.appConfig.accountOpenAuditReport.add(accountOpenAuditReport);

    }

    public void mismatch(APIAttribute attribute, String rkValue, String apiValue) {
        String details = String.format("API Value <%s> Different FROM RK<%s>", apiValue, rkValue);
        this.mismatch(attribute,details);
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

    public Boolean testIsTPPAccount() {
        if (this.accountDataRecord.isTPPSubscribed()) {
            return true;
        }
        this.mismatch(APIAttribute.TPA_NOT_SUBSCRIBED, this.accountDataRecord.getAttribute(APIAttribute.ACCOUNT_NUMBER));   
        return false;
    }

    public Boolean testIsTPPAccountWithBalance() {
        if (this.accountDataRecord.isTPPSubcribedWithBalance() ) {
            return true;
        }
        this.mismatch(APIAttribute.TPA_NOT_SUBSCRIBED_WITH_BALANCE, this.accountDataRecord.getAttribute(APIAttribute.ACCOUNT_NUMBER));   
        return false;

    }
 



}





