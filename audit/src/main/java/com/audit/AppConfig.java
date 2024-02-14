package com.audit;

import com.audit.Data.RKDataStore;
import com.audit.Reports.AccountOpenAuditReport;

public class AppConfig {
    

    public RKDataStore rkDataStore;
    public AccountOpenAuditReport accountOpenAuditReport = new AccountOpenAuditReport();
    

    public AppConfig() {
        rkDataStore = new RKDataStore();
    }
}
