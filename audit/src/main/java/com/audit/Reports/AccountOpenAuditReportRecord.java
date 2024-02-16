package com.audit.Reports;

import com.audit.Data.APIActivityRecord;
import com.audit.Data.RKAccountDataRecord;
import com.audit.Tests.AuditExceptionCategory;


public class AccountOpenAuditReportRecord {

    public String field;
    public String frequency;
    public String exceptionCategory;
    public String exceptionReason;
    public String exceptionDescription;
    public String combineExceptionsDescription;
 

    public AccountOpenAuditReportRecord() {
    }

    public void noRKDatafound(APIActivityRecord record) {

        this.exceptionCategory = AuditExceptionCategory.MSG_ACCOUNT_NOT_FOUND.toString();

    }

 
}

