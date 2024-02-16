package com.audit;

import java.util.ArrayList;

import com.audit.Data.APIActivityDataStore;
import com.audit.Data.APIActivityRecord;
import com.audit.Tests.ProcessAccountRKToAPITests;

public class ProcessAuditReport {

    public AppConfig appConfig;
    
    public ProcessAuditReport(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    public  void run() {

        System.out.println("ProcessAuditReport");
       
        APIActivityDataStore dataStore = new APIActivityDataStore();
        ArrayList<APIActivityRecord> records = dataStore.getRecords();

        if (records == null) {
            System.out.println("No records found");
            return;
        }

        for (APIActivityRecord record : records) {

            switch (record.getAPICallType()) {
                case ACCOUNT_OPEN:
                   @SuppressWarnings("unused") ProcessAccountRKToAPITests accountRKToAPITests = new ProcessAccountRKToAPITests(appConfig, record);

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
        } 
    }
}
