package com.audit.Data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class APIActivityDataStore {

    public APIActivityRecord[] getRecords() {
        String path = System.getProperty("user.dir")+"/api_data.csv";
        readCSVFile(path);
        return null;
       
    }

    public void readCSVFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.err.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
