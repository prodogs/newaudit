package com.audit;

import com.audit.Data.APIActivityRecord;
import com.audit.Data.APIAttribute;
import com.audit.Data.RKFutureAllocationDataStore;
import com.audit.Data.RKFutureAllocationRecord;
import com.audit.Tests.ProcessFutureAllocationTests;

public class ProcessFutureAllocationAuditRecord {

    public APIActivityRecord apiActivityRecord;
    public RKFutureAllocationRecord futureAllocationRecord;
    public ProcessFutureAllocationTests processFutureAllocationTests;

    public ProcessFutureAllocationAuditRecord(AppConfig appConfig,APIActivityRecord apiActivityRecord) {
        this.apiActivityRecord = apiActivityRecord;
        this.processFutureAllocationTests = new ProcessFutureAllocationTests(appConfig,apiActivityRecord);
    }

    public void run() {
        RKFutureAllocationDataStore allocationStore = new RKFutureAllocationDataStore();
        this.futureAllocationRecord = allocationStore.getFutureAllocationRecord(apiActivityRecord.getAttribute(APIAttribute.FUTURE_ALLOCATION_ID));
   
   
   
   
    }
    
}
