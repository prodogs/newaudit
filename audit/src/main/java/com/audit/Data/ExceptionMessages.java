package com.audit.Data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


 
public class ExceptionMessages {

    public static ArrayList<AuditExceptionRecord> auditExceptions = new ArrayList<AuditExceptionRecord>();
    
    static {
        readCSV();
    }

    public static void readCSV() {
 
        String line = "";
        String csvSplitBy = ",";
        String systemDirectory = System.getProperty("user.dir");
        System.out.println("System Directory: " + systemDirectory);

        String csvFile = systemDirectory+"/exception.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                AuditExceptionRecord auditExceptionRecord = new AuditExceptionRecord(data[1], data[0], data[2], data[3], "");
                auditExceptions.add(auditExceptionRecord);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AuditExceptionRecord GetExceptionMessage(String attribute) {

        for (AuditExceptionRecord exceptionRecord : auditExceptions) {
           if (exceptionRecord.attribute.equals(attribute)) {
               return exceptionRecord;
           }

        }
        return null;

    }

}
 
