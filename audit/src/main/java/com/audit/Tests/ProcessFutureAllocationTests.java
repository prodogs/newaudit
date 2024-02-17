package com.audit.Tests;

import com.audit.AppConfig;
import com.audit.Data.APIActivityRecord;
import com.audit.Data.APIAttribute;
import com.audit.Data.RKFundAllocationRecord;
import com.audit.Data.RKFutureAllocationDataStore;
import com.audit.Data.RKFutureAllocationRecord;

public class ProcessFutureAllocationTests  extends ProcessTests {

    public ProcessFutureAllocationTests(AppConfig appConfig,APIActivityRecord apiActivityRecord) {
        super(appConfig, apiActivityRecord);
  
        RKFutureAllocationDataStore allocationStore = new RKFutureAllocationDataStore();

        this.dataRecord = allocationStore.getFutureAllocationRecord(apiActivityRecord.getAttribute(APIAttribute.FUTURE_ALLOCATION_ID));

        this.run();
    }


    public void run() {

        if (this.dataRecord == null) {
            System.out.println("Future Allocation Record not found");
            return;
        }   

        RKFutureAllocationRecord futureAllocationRecord = (RKFutureAllocationRecord) this.dataRecord;

        if (futureAllocationRecord.allocationTotal() > 100) {
            System.out.println("Allocation Total is greater than 100");
        }

        if (futureAllocationRecord.allocationTotal() < 100) {
            System.out.println("Allocation Total is less than 100");
        }

        for(RKFundAllocationRecord fundAllocation : futureAllocationRecord.fundAllocations) {
            
        }


    }




    
}
