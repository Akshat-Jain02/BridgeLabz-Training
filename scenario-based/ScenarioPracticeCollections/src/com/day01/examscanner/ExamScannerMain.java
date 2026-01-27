package com.day01.examscanner;

public class ExamScannerMain {
    public static void main(String[] args) {
        // choose subject
        MathAnswerSheet mathKey = new MathAnswerSheet();
        ExamScanner<MathAnswerSheet> mathScanner = new ExamScanner<>(mathKey);

        // change to your actual file path
        String csvFile = "samplefiles/mathanswers.csv";

        System.out.println("Processing Math exam answers...");
        mathScanner.processFile(csvFile);
        mathScanner.showResults();

        // example for another subject
         ScienceAnswerSheet scienceKey = new ScienceAnswerSheet();
         ExamScanner<ScienceAnswerSheet> scienceScanner = new ExamScanner<>(scienceKey);
         scienceScanner.processFile("samplefiles/scienceanswers.csv");
         scienceScanner.showResults();
    }
}