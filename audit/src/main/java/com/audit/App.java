package com.audit;

public class App 
{    
    
    public static void main( String[] args ) {

        AppConfig appConfig = new AppConfig();
        ProcessAuditReport processAuditReport = new ProcessAuditReport(appConfig);    
    
        processAuditReport.run();
    }
}
