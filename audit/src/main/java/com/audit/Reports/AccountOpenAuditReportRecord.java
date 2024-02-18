package com.audit.Reports;

import com.audit.Data.APIActivityRecord;
import com.audit.Tests.AuditExceptionCategory;

public class AccountOpenAuditReportRecord extends AuditReportRecord {

    public AccountOpenAuditReportRecord() {
        super();
    }

    public void noRKDatafound(APIActivityRecord record) {

        this.exceptionCategory = AuditExceptionCategory.MSG_ACCOUNT_NOT_FOUND.toString();

    }

 
}

