package com.audit.Reports;

public class TransactionsAuditReport extends AuditReport {

    public TransactionsAuditReport() {
        super();
    }

    public void add(AuditReportRecord record) {
        this.reportRecords.add(record);
    }
    
}
