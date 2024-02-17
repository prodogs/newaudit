package com.audit.Tests;

import com.audit.Data.APIActivityRecord;
import com.audit.Data.APIAttribute;
import com.audit.Data.ExceptionMessages;
import com.audit.Data.RKDataRecord;
import com.audit.Reports.AuditReportRecord;
import com.controllers.AppConfig;
import com.audit.Data.AuditExceptionRecord;

public class ProcessRKToAPITests {
    
    public RKDataRecord dataRecord ;   
    public APIActivityRecord apiActivityRecord ;
    public AppConfig appConfig;

    public ProcessRKToAPITests( AppConfig appConfig, APIActivityRecord apiActivityRecord) {
        this.apiActivityRecord = apiActivityRecord;
        this.appConfig = appConfig; ;
    }

    public void mismatch(APIAttribute attribute, String message) {

        System.out.println("Mismatch found for " + attribute.toString() + " " + message);
        AuditReportRecord accountOpenAuditReport = new AuditReportRecord();

        AuditExceptionRecord exception = ExceptionMessages.GetExceptionMessage(attribute.toString()); // Declare the variable 'exception'

        if (exception == null) {
            System.out.println("Exception not found for " + attribute.toString());
        }

        String details = message;
        
        accountOpenAuditReport.field = attribute.toString();
        accountOpenAuditReport.exceptionCategory = exception.category;
        accountOpenAuditReport.exceptionReason = exception.reason;
        accountOpenAuditReport.exceptionDescription = exception.description;
        accountOpenAuditReport.combineExceptionsDescription = details;
        this.appConfig.accountOpenAuditReport.add(accountOpenAuditReport);
    }

    public void mismatch(APIAttribute attribute, String rkValue, String apiValue) {
        String details = String.format("API Value <%s> Different FROM RK<%s>", apiValue, rkValue);
        this.mismatch(attribute,details);
    }

    public Boolean testAttribute(APIAttribute attribute) {

        String rkValue = this.dataRecord.getAttribute(attribute);
        String apiValue = this.apiActivityRecord.getAttribute(attribute);

        if (this.dataRecord.getAttribute(attribute).equals(apiActivityRecord.getAttribute(attribute))) {
            return true;
        }
        
        this.mismatch(attribute,rkValue,apiValue);
        return false;

    }
    

}