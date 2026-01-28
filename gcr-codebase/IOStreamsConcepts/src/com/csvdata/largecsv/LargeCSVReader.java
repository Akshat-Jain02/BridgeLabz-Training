package com.csvdata.largecsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LargeCSVReader {

    private static final int BATCH_SIZE = 100;

    public static void main(String[] args) {

        String filePath = "large.csv";
        List<String> batch = new ArrayList<>(BATCH_SIZE);
        long totalRecords = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            boolean headerSkipped = false;

            while ((line = br.readLine()) != null) {

                if (!headerSkipped) {
                    headerSkipped = true;
                    continue;
                }

                batch.add(line);

                if (batch.size() == BATCH_SIZE) {
                    totalRecords += processBatch(batch);
                    batch.clear();
                }
            }

            if (!batch.isEmpty()) {
                totalRecords += processBatch(batch);
                batch.clear();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Total records processed: " + totalRecords);
    }

    private static int processBatch(List<String> batch) {
        for (String record : batch) {
            // simulate processing
        }
        System.out.println("Processed batch of size: " + batch.size());
        return batch.size();
    }
}
