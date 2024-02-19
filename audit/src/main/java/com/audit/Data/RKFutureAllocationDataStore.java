package com.audit.Data;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class RKFutureAllocationDataStore {

    public ArrayList<RKFutureAllocationRecord> records = new ArrayList<RKFutureAllocationRecord>();

    public RKFutureAllocationDataStore() {
            readCSV();
    }

     public void readCSV() {
 
        String systemDirectory = System.getProperty("user.dir");

        String csvFile = systemDirectory+"/future_allocation.csv";

        try (CSVReader csvReader = new CSVReader(new FileReader(csvFile))) {
            String[] values = null;
            try {
                while ((values = csvReader.readNext()) != null) {
                    RKFutureAllocationRecord futureRecord = new RKFutureAllocationRecord(values[0], values[1], values[3]);
                    records.add(futureRecord);

                    }
                } catch (CsvValidationException e) {
                    e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
        }
            } catch (IOException e) {
                 e.printStackTrace();
    }
       
    }

    public RKFutureAllocationRecord getFutureAllocationRecord(String id) {
        for (RKFutureAllocationRecord record : this.records) {
            //System.out.println("Record: " + record.getAttribute(APIAttribute.ID));
            //System.out.println("ID: " + id);
            if (record.getAttribute(APIAttribute.ID).equals(id)) {
                return record;
            }
        }
        return null;
    }



}
