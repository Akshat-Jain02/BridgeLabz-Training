package com.csvdata.countrowscsvfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVRecordCounter {

    public static void main(String[] args) {

        String filePath = "src/com/csvdata/csvfiles/students.csv";
        int recordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // Skip header row
            br.readLine();

            while (br.readLine() != null) {
                recordCount++;
            }

            System.out.println("Total records (excluding header): " + recordCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
