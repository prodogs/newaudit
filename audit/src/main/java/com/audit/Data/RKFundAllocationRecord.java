package com.audit.Data;

public class RKFundAllocationRecord {

    public String fundName;
    public String fundPercent;

    public RKFundAllocationRecord(String fundName, String fundPercent) {
        this.fundName = fundName;
        this.fundPercent = fundPercent; 

    }

    public String getAttributes(APIAttribute attributeType) {
         switch (attributeType) {
            case FUTURE_ALLOCATION_FUND_CODE:
                return fundName;
            case FUTURE_ALLOCATION_FUND_PERCENT:
                return fundPercent;
            default:
                return null;
            } 
    }
}
