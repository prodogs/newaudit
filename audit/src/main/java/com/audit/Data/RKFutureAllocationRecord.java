package com.audit.Data;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class RKFutureAllocationRecord extends RKDataRecord {

    public ArrayList<RKFundAllocationRecord> fundAllocations;
    public String id;
    public String stamp;
    public String jsonPackage;

    public RKFutureAllocationRecord(String id, String stamp, String jsonPackage) {
        this.fundAllocations = new ArrayList<RKFundAllocationRecord>();
        this.id = id;
        this.stamp = stamp;
        this.jsonPackage = jsonPackage;
        
        JSONObject jsonObject = new JSONObject(jsonPackage);
        JSONArray jsonArray = jsonObject.getJSONArray("allocation");
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject allocation = jsonArray.getJSONObject(i);
            String fundCode = allocation.getString("fundCode");
            Double fundPercent = allocation.getDouble("percent");
            String fundPercentString = fundPercent.toString();
            this.fundAllocations.add(new RKFundAllocationRecord(fundCode, fundPercentString));
        }


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

    public String getAttribute(APIAttribute attribute) {

        if (attribute== APIAttribute.ID) {
            return this.id;
        } 
        return null;
 
    }

}
