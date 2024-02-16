import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
package com.audit;

public class test {
public class CSVReader {
    public static void main(String[] args) {
        String csvFile = "path/to/your/csv/file.csv";
        String line = "";
        String csvSplitBy = ",";

        List<JsonClass> jsonList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);

                // Create a new instance of your JSON class and populate it with the data
                JsonClass json = new JsonClass();
                json.setField1(data[0]);
                json.setField2(data[1]);
                // ...

                jsonList.add(json);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Do something with the populated JSON class list
        // ...
    }
    
}
