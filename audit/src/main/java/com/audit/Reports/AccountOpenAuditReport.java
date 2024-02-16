package com.audit.Reports;

import java.util.ArrayList;

public class AccountOpenAuditReport {

    public ArrayList<AccountOpenAuditReportRecord> reportRecords = new ArrayList<AccountOpenAuditReportRecord>();

    public void add(AccountOpenAuditReportRecord record) {
        this.reportRecords.add(record);
    }

    public void print() {
        for (AccountOpenAuditReportRecord record : reportRecords) {
            System.out.println(record.field + " " + record.frequency + " " + record.exceptionCategory + " " + record.exceptionReason + " " + record.exceptionDescription + " " + record.combineExceptionsDescription);
        }
    }
    
}
