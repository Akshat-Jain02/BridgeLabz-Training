package com.csvdata.writecsv;

import java.io.FileWriter;
import java.io.IOException;

public class EmployeeCSVFile {

    public static void main(String[] args) {

        String filePath = "src/com/csvdata/csvfiles/employees.csv";

        try (FileWriter writer = new FileWriter(filePath)) {

            writer.append("ID,Name,Department,Salary\n");

            writer.append("101,Akshat,IT,75000\n");
            writer.append("102,Rahul,HR,55000\n");
            writer.append("103,Priya,Finance,68000\n");
            writer.append("104,Neha,Marketing,60000\n");
            writer.append("105,Amit,Operations,72000\n");

            System.out.println("Employee CSV file created successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
