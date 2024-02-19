package com.audit.controllers;

import com.audit.Data.RKAccountDataStore;
import com.audit.Data.RKFutureAllocationDataStore;
import com.audit.Reports.AccountOpenAuditReport;
import com.audit.Reports.TransactionsAuditReport;

public class AppConfig {
    
    public RKAccountDataStore rkDataStore;
    public RKFutureAllocationDataStore rkFutureAllocationStore;
    public AccountOpenAuditReport accountOpenAuditReport = new AccountOpenAuditReport();
    public TransactionsAuditReport transactionAuditReport = new TransactionsAuditReport();
    
    public AppConfig() {
        this.rkDataStore = new RKAccountDataStore();
        this.rkFutureAllocationStore = new RKFutureAllocationDataStore();
    }
}
