package com.controllers;

public class App 
{    
    
    public static void main( String[] args ) {

        AppConfig appConfig = new AppConfig();
       
        ProcessAuditReport processAuditReport = new ProcessAuditReport(appConfig);    
        processAuditReport.run();
        appConfig.accountOpenAuditReport.print();
    }
}
