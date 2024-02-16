package com.audit;


import com.audit.Data.APIActivityRecord;
import com.audit.Data.RKAccountDataRecord;
import com.audit.Data.RKDataStore;
import com.audit.Tests.ProcessAccountRKToAPITests;

public class ProcessAccountOpenAuditRecord {

    public RKAccountDataRecord accountDataRecord;
    public RKDataStore rkDataStore = new RKDataStore();
    public ProcessAccountRKToAPITests processAccountRKToAPITests;

    public Boolean RunTests(AppConfig appConfig,APIActivityRecord apiActivityRecord) {
        
        this.accountDataRecord = rkDataStore.getAccountDataRecord(apiActivityRecord);

        if (this.accountDataRecord == null) {
            return false;
        }

        this.processAccountRKToAPITests = new ProcessAccountRKToAPITests(appConfig,apiActivityRecord);
        return false;

    }

}
