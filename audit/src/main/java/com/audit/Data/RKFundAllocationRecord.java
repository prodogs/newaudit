package com.audit.Data;

public class RKFundAllocationRecord {
    public String fundCode;
    public String fundPercentString;

    public RKFundAllocationRecord(String fundCode, String fundPercentString) {
        this.fundCode = fundCode;
        this.fundPercentString = fundPercentString;
    }

    public String getAttributes(APIAttribute attribute) {
        if (attribute == APIAttribute.FUTURE_ALLOCATION_FUND_CODE) {
            return this.fundCode;
        } else if (attribute == APIAttribute.FUTURE_ALLOCATION_FUND_PERCENT) {
            return this.fundPercentString;
        }
        return null;
    }
    
}
