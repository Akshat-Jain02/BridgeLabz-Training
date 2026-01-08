package com.searching.io;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class InputStreamReaderReadFile {

    public static void main(String[] args) {

    	String filePath = "src/com/searching/io/input.txt"; 

        // try-with-resources for auto closing
        try (FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader isr =
                     new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(isr)) {

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
