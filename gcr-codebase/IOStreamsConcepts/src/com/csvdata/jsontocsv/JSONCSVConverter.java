package com.csvdata.jsontocsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JSONCSVConverter {

    public static void main(String[] args) {
        convertJSONToCSV();
        convertCSVToJSON();
    }

    public static void convertJSONToCSV() {

    	  String jsonFile = "src/com/csvdata/csvfiles/students_from_csv.json";
          String csvFile = "src/com/csvdata/csvfiles/students_from_json.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(jsonFile));
             FileWriter writer = new FileWriter(csvFile)) {

            writer.write("ID,Name,Age,Marks\n");

            String line;
            while ((line = reader.readLine()) != null) {

                line = line.trim();

                if (line.equals("[") || line.equals("]") || line.isEmpty()) {
                    continue;
                }

                if (line.endsWith(",")) {
                    line = line.substring(0, line.length() - 1);
                }

                line = line.replace("{", "")
                           .replace("}", "")
                           .replace("\"", "");

                String[] fields = line.split(",");

                String id = fields[0].split(":")[1];
                String name = fields[1].split(":")[1];
                String age = fields[2].split(":")[1];
                String marks = fields[3].split(":")[1];

                writer.write(id + "," + name + "," + age + "," + marks + "\n");
            }

            System.out.println("JSON to CSV conversion completed");

        } catch (IOException e) {
            System.out.println("Error converting JSON to CSV");
        }
    }


    // CSV → JSON
    public static void convertCSVToJSON() {

    	  String jsonFile = "src/com/csvdata/csvfiles/students_from_csv.json";
          String csvFile = "src/com/csvdata/csvfiles/students_from_json.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile));
             FileWriter writer = new FileWriter(jsonFile)) {

            writer.write("[\n");

            String line;
            boolean isHeader = true;
            boolean first = true;

            while ((line = reader.readLine()) != null) {

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] arr = line.split(",");

                if (!first) {
                    writer.write(",\n");
                }

                writer.write("  {");
                writer.write("\"ID\":" + arr[0] + ",");
                writer.write("\"Name\":\"" + arr[1] + "\",");
                writer.write("\"Age\":" + arr[2] + ",");
                writer.write("\"Marks\":" + arr[3]);
                writer.write("}");

                first = false;
            }

            writer.write("\n]");
            System.out.println("CSV to JSON conversion completed");

        } catch (IOException e) {
            System.out.println("Error converting CSV to JSON");
        }
    }
}
