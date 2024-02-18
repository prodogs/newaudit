package com.audit.Reports;

import java.io.IOException;

import org.dhatim.fastexcel.Workbook;
import org.dhatim.fastexcel.Worksheet;

public class AccountOpenAuditReport extends AuditReport {

    public AccountOpenAuditReport() {
        super();
 
    }

    public void add(AuditReportRecord record) {
        this.reportRecords.add(record);
    }


    public void print(Workbook wb) throws IOException { {
        Worksheet ws = wb.newWorksheet("Account Open");
        ws.width(0, 25);
        ws.width(1, 15);
    
        //ws.range(0, 0, 0, 1).style().fontName("Arial").fontSize(16).bold().fillColor("3366FF").set();
        ws.value(0, 0, "Account Opening Fields");
        ws.value(0, 1, "Compare");
        ws.value(0, 2, "Frequency");
        ws.value(0, 3, "Exception Category");
        ws.value(0, 4, "Exception Reason");
        ws.value(0, 5, "Exception Description (OUTPUT)");
        ws.value(0, 6, "Combine Exceptions Description");

    
        //ws.range(2, 0, 2, 1).style().wrapText(true).set();
        int row = 1;
        for (AuditReportRecord record : this.reportRecords) {
            ws.value(row, 0, record.field);
            ws.value(row, 1, "Frequency");
            ws.value(row, 2, record.exceptionCategory);
            ws.value(row, 3, record.exceptionReason);   
            ws.value(row, 4, record.exceptionDescription);
            ws.value(row, 5, record.combineExceptionsDescription);
            row++;

            // System.out.println(record.field + " " + record.frequency + " " + record.exceptionCategory + " " + record.exceptionReason + " " + record.exceptionDescription + " " + record.combineExceptionsDescription);
        }
        ws.close();
    }
}




}
