package com.audit.Tests;

import com.audit.Data.APIActivityRecord;
import com.audit.Data.APIAttribute;
import com.audit.Data.RKFundAllocationRecord;
import com.audit.Data.RKFutureAllocationDataStore;
import com.audit.Data.RKFutureAllocationRecord;
import com.controllers.AppConfig;

public class ProcessFutureAllocationTests  extends ProcessTests {

    public ProcessFutureAllocationTests(AppConfig appConfig,APIActivityRecord apiActivityRecord) {
        super(appConfig, apiActivityRecord);
  
        RKFutureAllocationDataStore allocationStore = new RKFutureAllocationDataStore();

        this.dataRecord = allocationStore.getFutureAllocationRecord(apiActivityRecord.getAttribute(APIAttribute.ID));

        this.run();
    }


    public void run() {

        if (this.dataRecord == null) {
            System.out.println("Future Allocation Record not found for " + this.apiActivityRecord.getAttribute(APIAttribute.ID));
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
