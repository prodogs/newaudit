package com.audit.Tests;

import com.audit.AppConfig;
import com.audit.Data.APIActivityRecord;
import com.audit.Data.APIAttribute;
import com.audit.Data.RKAccountDataRecord;
import com.audit.Reports.AccountOpenAuditReportRecord;

public class ProcessAccountRKToAPITests {
    
    public RKAccountDataRecord accountDataRecord ;   
    public APIActivityRecord apiActivityRecord ;
    public AppConfig appConfig;

    public ProcessAccountRKToAPITests(
        AppConfig appConfig, 
        APIActivityRecord apiActivityRecord) {

        this.apiActivityRecord = apiActivityRecord;
    }

    public Boolean run() {
        this.accountDataRecord = this.appConfig.rkDataStore.getAccountDataRecord(apiActivityRecord);

        if (this.accountDataRecord == null) {
            this.noRKDatafound();
            return false;
        }
        return true;

    }

    public void noRKDatafound() {
        
        AccountOpenAuditReportRecord accountOpenAuditReport = new AccountOpenAuditReportRecord();
        accountOpenAuditReport.noRKDatafound(this.apiActivityRecord);

        this.appConfig.accountOpenAuditReport.add(accountOpenAuditReport);
    }

    public Boolean testFirstName()  {
        if (this.accountDataRecord.getFirstName().equals(apiActivityRecord.getAttribute(APIAttribute.FIRST_NAME))) { 
            return true;
        }
        AccountOpenAuditReportRecord accountOpenAuditReport = new AccountOpenAuditReportRecord();
        accountOpenAuditReport.firstNameMistmatch(this.apiActivityRecord,this.accountDataRecord);

        this.appConfig.accountOpenAuditReport.add(accountOpenAuditReport);
        return false;
    }
}