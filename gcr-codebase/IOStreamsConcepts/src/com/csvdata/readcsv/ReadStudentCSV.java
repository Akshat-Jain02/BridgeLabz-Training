package com.csvdata.readcsv;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadStudentCSV {

    public static void main(String[] args) {

        String filePath = "src/com/csvdata/csvfiles/students.csv"; 
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // Skip header line
            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                int marks = Integer.parseInt(data[3]);

                // Structured output
                System.out.println("Student ID   : " + id);
                System.out.println("Student Name : " + name);
                System.out.println("Age          : " + age);
                System.out.println("Marks        : " + marks);
                System.out.println("----------------------------");
            }

        } catch (IOException e) {
            System.out.println("Error reading the CSV file");
            e.printStackTrace();
        }
    }
}
