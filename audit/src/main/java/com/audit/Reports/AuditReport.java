package com.audit.Reports;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.dhatim.fastexcel.Workbook;
import com.controllers.AppConfig;

public class AuditReport {

        public ArrayList<AuditReportRecord> reportRecords = new ArrayList<AuditReportRecord>();

        public AuditReport() {
            this.reportRecords = new ArrayList<AuditReportRecord>();

        }
        public void print() {

        }

        public static void Publish(AppConfig appConfig) throws IOException {

            File currDir = new File(".");
            String path = currDir.getAbsolutePath();
            String fileLocation = path.substring(0, path.length() - 1) + "fastexcel.xlsx";
            String systemDirectory = System.getProperty("user.dir");

            String csvFile = systemDirectory+"/fastexcel.xlsx";


            try (OutputStream os = Files.newOutputStream(Paths.get(fileLocation)); 
                Workbook wb = new Workbook(os, "AUDIT ", "1.0")) {
                appConfig.accountOpenAuditReport.print(wb);
                appConfig.transactionAuditReport.print(wb);
            }
        }

        public void add(AuditReportRecord record) {
            this.reportRecords.add(record);
        }   
}