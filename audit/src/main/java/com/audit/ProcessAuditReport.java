package com.audit;

import com.audit.Data.APIActivityDataStore;
import com.audit.Data.APIActivityRecord;

public class ProcessAuditReport {

    public AppConfig appConfig;
    
    public ProcessAuditReport(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    public  void run() {
        System.out.println("ProcessAuditReport");
       
        APIActivityDataStore dataStore = new APIActivityDataStore();
        APIActivityRecord records[] = dataStore.getRecords();
        return;/*
        for (APIActivityRecord record : records) {
            System.out.println(record);

            switch (record.getAPICallType()) {
                case ACCOUNT_OPEN:
                    System.out.println("NEW_ACCOUNT");
                    ProcessAccountRKToAPITests accountRKToAPITests = new ProcessAccountRKToAPITests(appConfig, record);
                    accountRKToAPITests.run();
                    break;


                case ALLOCATION_MODEL:
                    System.out.println("ALLOCATION_MODEL");
                    break;
                case PARTICIPANT_DATA:
                    System.out.println("PARTICIPANT_DATA");
                    break;
                case BENEFICIARY_DATA:
                    System.out.println("BENEFICIARY_DATA");
                    break;
                default:
                    System.out.println("UNKNOWN");
                    break;
            }   
        } */
    }
}
