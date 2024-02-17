package com.controllers;

import com.audit.Data.RKAccountDataStore;
import com.audit.Reports.AccountOpenAuditReport;

public class AppConfig {
    

    public RKAccountDataStore rkDataStore;
    public AccountOpenAuditReport accountOpenAuditReport = new AccountOpenAuditReport();
    

    public AppConfig() {
        rkDataStore = new RKAccountDataStore();
    }
}
