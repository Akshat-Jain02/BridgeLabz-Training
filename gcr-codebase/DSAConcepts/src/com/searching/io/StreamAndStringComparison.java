package com.searching.io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class StreamAndStringComparison {

    // ---------- StringBuilder vs StringBuffer ----------
    private static void compareStringClasses() {
        int n = 1_000_000;
        String text = "hello";

        // StringBuilder
        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(text);
        }
        long endBuilder = System.nanoTime();

        // StringBuffer
        long startBuffer = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbuf.append(text);
        }
        long endBuffer = System.nanoTime();

        System.out.println("---- String Concatenation Comparison ----");
        System.out.println("StringBuilder Time : " + (endBuilder - startBuilder) + " ns");
        System.out.println("StringBuffer Time  : " + (endBuffer - startBuffer) + " ns");
        System.out.println();
    }

    // ---------- FileReader ----------
    private static long countWordsUsingFileReader(String fileName) throws IOException {
        long wordCount = 0;

        try (FileReader fr = new FileReader(fileName);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        }
        return wordCount;
    }

    // ---------- InputStreamReader ----------
    private static long countWordsUsingInputStreamReader(String fileName) throws IOException {
        long wordCount = 0;

        try (FileInputStream fis = new FileInputStream(fileName);
             InputStreamReader isr =
                     new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        }
        return wordCount;
    }

    public static void main(String[] args) {

        String fileName = "src/com/searching/io/input.txt"; // e.g., 100MB file

        // ---- String comparison ----
        compareStringClasses();

        try {
            // ---- FileReader test ----
            long startFR = System.nanoTime();
            long wordsFR = countWordsUsingFileReader(fileName);
            long endFR = System.nanoTime();

            // ---- InputStreamReader test ----
            long startISR = System.nanoTime();
            long wordsISR = countWordsUsingInputStreamReader(fileName);
            long endISR = System.nanoTime();

            System.out.println("---- File Reading & Word Count ----");
            System.out.println("FileReader Word Count        : " + wordsFR);
            System.out.println("FileReader Time              : " + (endFR - startFR) + " ns");
            System.out.println();
            System.out.println("InputStreamReader Word Count : " + wordsISR);
            System.out.println("InputStreamReader Time       : " + (endISR - startISR) + " ns");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
