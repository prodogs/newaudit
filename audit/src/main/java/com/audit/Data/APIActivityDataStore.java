package com.audit.Data;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONObject;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;



public class APIActivityDataStore {


    public ArrayList<APIActivityRecord> records = new ArrayList<APIActivityRecord>();

    public ArrayList<APIActivityRecord> getRecords() {
        this.records = new ArrayList<APIActivityRecord>();
        String path = System.getProperty("user.dir")+"/account_api_data.csv";
        System.out.println("Path: " + path);
        readCSVFile(path);
        return this.records;
       
    }

    public void readCSVFile(String filePath) {

        System.out.println("Reading CSV file: " + filePath);
        this.records = new ArrayList<APIActivityRecord>();

        try (CSVReader csvReader = new CSVReader(new FileReader(filePath))) {
            String[] values = null;
            try {
                while ((values = csvReader.readNext()) != null) {
                    APIActivityRecord activityRecord = new APIActivityRecord();
                    activityRecord.id = values[0];
                    activityRecord.type = values[1];
                    activityRecord.stamp = values[2];
                    String str = values[3];     
                    JSONObject json = new JSONObject(str);
                    activityRecord.jsonPackage = json;
                    records.add(activityRecord);

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

    }
    
