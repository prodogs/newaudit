package com.audit;


import com.audit.Data.APIActivityRecord;
import com.audit.Data.RKAccountDataRecord;
import com.audit.Data.RKDataStore;

public class ProcessAccountOpenAudit {

    public RKAccountDataRecord accountDataRecord;
    public RKDataStore rkDataStore = new RKDataStore();

    public Boolean RunTests(APIActivityRecord apiActivityRecord) {
        
        this.accountDataRecord = rkDataStore.getAccountDataRecord(apiActivityRecord);

        if (this.accountDataRecord.getAccountNumber() == null) {
            return false;
        }

        return false;

    }



    
}
