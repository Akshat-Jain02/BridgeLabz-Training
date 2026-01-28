package com.csvdata.modifycsv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeRecordsModifyApp {

    public static void main(String[] args) {

        String inputFile = "src/com/csvdata/csvfiles/employees.csv";
        String outputFile = "src/com/csvdata/csvfiles/employees_updated.csv";

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {

            String line;

            // Read and write header as-is
            line = br.readLine();
            bw.write(line);
            bw.newLine();

            // Process remaining records
            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String department = data[2];
                double salary = Double.parseDouble(data[3]);

                // Increase salary by 10% for IT department
                if (department.equalsIgnoreCase("IT")) {
                    salary = salary * 1.10;
                }

                // Write updated record
                bw.write(id + "," + name + "," + department + "," + (int) salary);
                bw.newLine();
            }

            System.out.println("Updated CSV file created successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
