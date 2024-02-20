package com.audit.Tests;

import com.audit.Data.APIActivityRecord;
import com.audit.Data.APIAttribute;
import com.audit.Data.ExceptionMessages;
import com.audit.Data.RKFutureAllocationDataStore;
import com.audit.Data.RKFutureAllocationRecord;
import com.audit.Reports.AuditExceptionRecord;
import com.audit.Reports.ExceptionMessages;
import com.audit.controllers.AppConfig;
import com.audit.Data.ExceptionMessages;
import com.audit.ExceptionMessages;


// Class Responsible to Handle all tests related to Allocation Requests or Realiangment Requests

public class ProcessRKFutureAllocationToAPITests  extends ProcessRKToAPITests {

    public ProcessRKFutureAllocationToAPITests(AppConfig appConfig,APIActivityRecord apiActivityRecord) {
        super(appConfig, apiActivityRecord);
  
        RKFutureAllocationDataStore allocationStore = new RKFutureAllocationDataStore();

        String apiActivityRecordID = apiActivityRecord.getAttribute(APIAttribute.ID);

        this.dataRecord = allocationStore.getFutureAllocationRecord(apiActivityRecordID);

        this.run();
    }


    public void run() {

        if (this.dataRecord == null) {
            System.out.println("Future Allocation Record not found for " + this.apiActivityRecord.getAttribute(APIAttribute.ID));
            return;
        }   

        if (this.apiActivityRecord.isFailureResponse()) {
            this.failureResponse();
            return;
        }
        RKFutureAllocationRecord futureAllocationRecord = (RKFutureAllocationRecord) this.dataRecord;

        if (futureAllocationRecord.allocationTotal() > 100) {
            this.allocationsGreatherThan100();
        } else
         if (futureAllocationRecord.allocationTotal() < 100) {
            this.allocationsLessThan100();
        }

        for(RKFundAllocationRecord fundAllocation : futureAllocationRecord.fundAllocations) {             
        }
        
    }


    public void failureResponse() {
                AuditReportRecord transAuditReport = new AuditReportRecord();

                String attribute = APIAttribute.FUTURE_ALLOCATION_FAILURE.toString();

                AuditExceptionRecord exception = ExceptionMessages.GetExceptionMessage(attribute);

                if (exception == null) {
                    System.out.println("Exception not found for " + attribute.toString());
                    return;
                }

                String details = "Failure Response";

                transAuditReport.field = attribute.toString();

        transAuditReport.exceptionCategory = exception.category;
        transAuditReport.exceptionReason = exception.reason;
        transAuditReport.exceptionDescription = exception.description;
        transAuditReport.combineExceptionsDescription = details;

        this.appConfig.transactionAuditReport.add(transAuditReport);

    }


    public void allocationsGreatherThan100() {
        //System.out.println("Allocation Total is greater than 100");
        AuditReportRecord transAuditReport = new AuditReportRecord();

        String attribute = APIAttribute.FUTURE_ALLOCATION_GREATER_100.toString();

        AuditExceptionRecord exception = ExceptionMessages.GetExceptionMessage(attribute);

        if (exception == null) {
            System.out.println("Exception not found for " + attribute.toString());
        }

        String details = "Allocation Greater than 100";
        
        transAuditReport.field = attribute.toString();
        transAuditReport.exceptionCategory = exception.category;
        transAuditReport.exceptionReason = exception.reason;
        transAuditReport.exceptionDescription = exception.description;
        transAuditReport.combineExceptionsDescription = details;
        this.appConfig.transactionAuditReport.add(transAuditReport);

    }

    public void allocationsLessThan100() {
       // System.out.println("Allocation Total is less than 100");

        //System.out.println("Allocation Total is greater than 100");
        AuditReportRecord transAuditReport = new AuditReportRecord();

        String attribute = APIAttribute.FUTURE_ALLOCATION_LESS_100.toString();

        AuditExceptionRecord exception = ExceptionMessages.GetExceptionMessage(attribute);

        if (exception == null) {
            System.out.println("Exception not found for " + attribute.toString());
        }

        String details = "Allocation Less than 100";

        transAuditReport.field = attribute.toString();
        transAuditReport.exceptionCategory = exception.category;
        transAuditReport.exceptionReason = exception.reason;
        transAuditReport.exceptionDescription = exception.description;
        transAuditReport.combineExceptionsDescription = details;
        this.appConfig.transactionAuditReport.add(transAuditReport);
    }   

}
