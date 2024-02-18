package com.controllers;

import java.io.IOException;

import com.audit.Reports.AuditReport;

public class App 
{    
    
    public static void main( String[] args ) throws IOException {

        AppConfig appConfig = new AppConfig();
       
        ProcessAuditReport processAuditReport = new ProcessAuditReport(appConfig);    
        processAuditReport.run();
        AuditReport.Publish(appConfig);
        appConfig.accountOpenAuditReport.print();
        appConfig.transactionAuditReport.print();
    }
}
