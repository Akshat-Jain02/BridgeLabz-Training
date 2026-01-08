package com.searching.io;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileLineReader {

    public static void main(String[] args) {

        try {
        	String filePath = "src/com/searching/io/input.txt";
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
