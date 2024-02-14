package com.audit.Reports;

import java.util.ArrayList;

public class AccountOpenAuditReport {

    public ArrayList<AccountOpenAuditReportRecord> reportRecords = new ArrayList<AccountOpenAuditReportRecord>();


    public void add(AccountOpenAuditReportRecord record) {
        this.reportRecords.add(record);
    }
    
}
