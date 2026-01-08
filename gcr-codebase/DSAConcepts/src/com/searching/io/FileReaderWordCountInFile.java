package com.searching.io;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReaderWordCountInFile {

    public static void main(String[] args) {

        String filePath = "src/com/searching/io/input.txt";   // file to read
        String targetWord = "java";      // word to count
        int count = 0;

        // try-with-resources automatically closes FileReader & BufferedReader
        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;

            while ((line = br.readLine()) != null) {

                // Split line into words
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            // Output result
            System.out.println("The word \"" + targetWord + "\" appears " + count + " times.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
