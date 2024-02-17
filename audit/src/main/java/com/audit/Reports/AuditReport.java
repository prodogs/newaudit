package com.audit.Reports;

import java.util.ArrayList;

public class AuditReport {

        public ArrayList<AuditReportRecord> reportRecords = new ArrayList<AuditReportRecord>();

        public AuditReport() {
            this.reportRecords = new ArrayList<AuditReportRecord>();

        }

        public void add(AuditReportRecord record) {
            this.reportRecords.add(record);
        }   
}