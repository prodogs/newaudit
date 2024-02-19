package com.audit.controllers;


import com.audit.Data.APIActivityRecord;
import com.audit.Data.RKAccountDataRecord;
import com.audit.Data.RKAccountDataStore;
import com.audit.Tests.ProcessAccountRKToAPITests;

public class ProcessAccountOpenAuditRecord {

    public RKAccountDataRecord accountDataRecord;
    public RKAccountDataStore rkDataStore = new RKAccountDataStore();
    public ProcessAccountRKToAPITests processAccountRKToAPITests;

    public Boolean RunTests(AppConfig appConfig,APIActivityRecord apiActivityRecord) {
        
        this.accountDataRecord = rkDataStore.getAccountDataRecord(apiActivityRecord);

        this.processAccountRKToAPITests = new ProcessAccountRKToAPITests(appConfig,apiActivityRecord);
        return false;

    }

}
