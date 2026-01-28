package com.csvdata.mergecsvfiles;

import java.io.*;
import java.util.*;

public class CSVMerger {

    public static void main(String[] args) {

        String file1 = "src/com/csvdata/csvfiles/students1.csv";
        String file2 = "src/com/csvdata/csvfiles/students2.csv";
        String outputFile = "src/com/csvdata/csvfiles/students_merged.csv";

        Map<Integer, String[]> studentInfo = new HashMap<>();
        List<Student> mergedStudents = new ArrayList<>();

        try (BufferedReader br1 = new BufferedReader(new FileReader(file1))) {

            String line;
            br1.readLine();

            while ((line = br1.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0].trim());
                studentInfo.put(id, data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br2 = new BufferedReader(new FileReader(file2))) {

            String line;
            br2.readLine();

            while ((line = br2.readLine()) != null) {
                String[] data2 = line.split(",");
                int id = Integer.parseInt(data2[0].trim());

                if (studentInfo.containsKey(id)) {
                    String[] data1 = studentInfo.get(id);

                    Student student = new Student(
                            id,
                            data1[1].trim(),
                            Integer.parseInt(data1[2].trim()),
                            Integer.parseInt(data2[1].trim()),
                            data2[2].trim()
                    );

                    mergedStudents.add(student);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();

            for (Student s : mergedStudents) {
                bw.write(s.toCsv());
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("CSV files merged successfully.");
    }
}
