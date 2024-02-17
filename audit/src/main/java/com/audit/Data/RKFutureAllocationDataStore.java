package com.audit.Data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class RKFutureAllocationDataStore {

    public ArrayList<RKFutureAllocationRecord> records = new ArrayList<RKFutureAllocationRecord>();

    public RKFutureAllocationDataStore() {
            readCSV();
    }

     public void readCSV() {
 
        String line = "";
        String csvSplitBy = ",";
        String systemDirectory = System.getProperty("user.dir");

        String csvFile = systemDirectory+"/future_allocation.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                RKFutureAllocationRecord futureRecord = new RKFutureAllocationRecord(data[0], data[1], data[2]);
                records.add(futureRecord);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public RKFutureAllocationRecord getFutureAllocationRecord(String id) {
        for (RKFutureAllocationRecord record : records) {
            if (record.getAttribute(APIAttribute.FUTURE_ALLOCATION_ID).equals(id)) {
                return record;
            }
        }
        return null;
    }



}
