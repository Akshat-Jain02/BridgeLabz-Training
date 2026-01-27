
package com.day01.resumeanalyzer;

public class ResumeAnalyzerMain {

    public static void main(String[] args) {
    	System.out.println("============================================================================");
    	System.out.println("                 RESUME ANALYZER");
    	System.out.println("============================================================================");
        ResumeAnalyzer analyzer = new ResumeAnalyzer();

        String folder = "samplefiles";

        analyzer.processFolder(folder);
        analyzer.showResults();
        System.out.println("============================================================================");
    }
}