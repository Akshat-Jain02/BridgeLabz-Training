package com.day01.coderepocleaner;

import java.io.IOException;

public class CodeRepoCleanerMain {
    public static void main(String[] args) {
        CodeRepoCleaner cleaner = new CodeRepoCleaner();

        // sample repo path
        String sourceFolder = "samplefiles/myrepo";
        String outputBase = "samplefiles/myrepocleaned";

        try {
            cleaner.cleanRepo(sourceFolder, outputBase);

            // examples of filtering
            // List<Path> large = cleaner.getLargeFiles(sourceFolder, 100 * 1024); // >100KB
            // List<Path> recent = cleaner.getRecentFiles(sourceFolder, 7); // last 7 days

            // System.out.println("Large files: " + large.size());
            // System.out.println("Recent files: " + recent.size());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}