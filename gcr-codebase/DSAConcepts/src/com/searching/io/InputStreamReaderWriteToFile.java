package com.searching.io;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputStreamReaderWriteToFile {

    public static void main(String[] args) {

    	String filePath = "src/com/searching/io/output.txt";

        System.out.println("Enter text (type 'exit' to stop):");

        // try-with-resources for auto closing
        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr);
             FileWriter fw = new FileWriter(filePath, true)) {

            String input;

            // Read input until user types "exit"
            while ((input = br.readLine()) != null) {

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                // Write input to file as a new line
                fw.write(input + System.lineSeparator());
            }

            System.out.println("Input successfully written to file.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
