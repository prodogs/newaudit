package com.audit.Reports;

public class AccountOpenAuditReport extends AuditReport {

    public AccountOpenAuditReport() {
        super();
 
    }

    public void add(AuditReportRecord record) {
        this.reportRecords.add(record);
    }

    public void print() {
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("API Audit Report: Account Open Audit Report");
        System.out.println("---------------------------------------------------------------------------------------");
        for (AuditReportRecord record : this.reportRecords) {
            System.out.println(record.field + " " + record.frequency + " " + record.exceptionCategory + " " + record.exceptionReason + " " + record.exceptionDescription + " " + record.combineExceptionsDescription);
        }
        System.out.println("---------------------------------------------------------------------------------------");
    }
    
}
