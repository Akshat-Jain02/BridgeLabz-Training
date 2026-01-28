package com.csvdata.duplicaterecordcsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CSVDuplicateDetector {

    public static void main(String[] args) {

        String filePath = "src/com/csvdata/csvfiles/students.csv";
        Set<Integer> seenIds = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            boolean headerSkipped = false;

            while ((line = br.readLine()) != null) {

                if (!headerSkipped) {
                    headerSkipped = true;
                    continue;
                }

                String[] columns = line.split(",");
                int id = Integer.parseInt(columns[0].trim());

                if (!seenIds.add(id)) {
                    System.out.println("Duplicate record found:");
                    System.out.println(line);
                    System.out.println("-------------------------");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
