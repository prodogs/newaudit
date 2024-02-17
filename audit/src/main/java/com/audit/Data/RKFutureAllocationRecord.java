package com.audit.Data;

import java.util.ArrayList;

public class RKFutureAllocationRecord extends RKDataRecord {

    public ArrayList<RKFundAllocationRecord> fundAllocations;

    public RKFutureAllocationRecord() {
        this.fundAllocations = new ArrayList<RKFundAllocationRecord>();
    }

    public RKFundAllocationRecord getFundAllocation(String fundCode) {
        for (RKFundAllocationRecord record : fundAllocations) {
            if (record.getAttributes(APIAttribute.FUTURE_ALLOCATION_FUND_CODE).equals(fundCode)) {
                return record;
            }
        }
        return null;
    }

    public Double allocationTotal() {
        Double total = 0.0;
        for (RKFundAllocationRecord record : fundAllocations) {
            total += Double.parseDouble(record.getAttributes(APIAttribute.FUTURE_ALLOCATION_FUND_PERCENT));
        }
        return total;
    }
    

    public void addFundAllocation(String fundName, String fundPercent) {
        this.fundAllocations.add(new RKFundAllocationRecord(fundName, fundPercent));
    }   


}
