package com.audit.Tests;

import com.audit.AppConfig;
import com.audit.Data.APIActivityRecord;
import com.audit.Data.APIAttribute;
import com.audit.Data.RKAccountDataRecord;
import com.audit.Reports.AccountOpenAuditReportRecord;


public class ProcessAccountRKToAPITests extends ProcessTests {
    
    public ProcessAccountRKToAPITests( AppConfig appConfig, APIActivityRecord apiActivityRecord) {
        super(appConfig, apiActivityRecord);
        this.run();
    }

    public void run() {

        this.dataRecord = this.appConfig.rkDataStore.getAccountDataRecord(apiActivityRecord);

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
    
    public void noRKDatafound() {

        AccountOpenAuditReportRecord accountOpenAuditReport = new AccountOpenAuditReportRecord();
        accountOpenAuditReport.noRKDatafound(this.apiActivityRecord);
        this.appConfig.accountOpenAuditReport.add(accountOpenAuditReport);
    }

    public Boolean testIsTPPAccount() {
        RKAccountDataRecord accountDataRecord; // Declare the variable
        accountDataRecord = (RKAccountDataRecord) this.dataRecord; // Assign a value to it
        if (accountDataRecord.isTPPSubscribed()) {
            return true;
        }
        this.mismatch(APIAttribute.TPA_NOT_SUBSCRIBED, this.dataRecord.getAttribute(APIAttribute.ACCOUNT_NUMBER));   
        return false;
    }

    public Boolean testIsTPPAccountWithBalance() {

        RKAccountDataRecord accountDataRecord; // Declare the variable
        accountDataRecord = (RKAccountDataRecord) this.dataRecord; // Assign a value to it
        if (accountDataRecord.isTPPSubcribedWithBalance() ) {
            return true;
        }
        this.mismatch(APIAttribute.TPA_NOT_SUBSCRIBED_WITH_BALANCE, accountDataRecord.getAttribute(APIAttribute.ACCOUNT_NUMBER));   
        return false;
    }
 



}





