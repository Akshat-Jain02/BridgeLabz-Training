package com.day04.zipzipmart;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ZipZipMart {
    private static final DateTimeFormatter DATE_FORMAT = 
            DateTimeFormatter.ofPattern("yyyy-MM-dd");
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many sales records today? ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        
        Sale[] sales = new Sale[n];
        int validCount = 0;
        
        System.out.println("\nEnter each sale (date amount branch)");
        System.out.println("Date format: yyyy-MM-dd");
        System.out.println("Example: 2025-01-15 1250.50 IndoreCentral\n");
        
        for (int i = 0; i < n; i++) {
            System.out.print("Record " + (i+1) + ": ");
            String line = sc.nextLine().trim();
            
            String[] parts = line.split("\\s+", 3);
            if (parts.length < 3) {
                System.out.println("Invalid format! Try again.");
                i--;
                continue;
            }
            
            LocalDate date;
            try {
                date = LocalDate.parse(parts[0], DATE_FORMAT);
            } catch (DateTimeParseException e) {
                System.out.println("Wrong date format! Use yyyy-MM-dd");
                i--;
                continue;
            }
            
            double amount;
            try {
                amount = Double.parseDouble(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount! Try again.");
                i--;
                continue;
            }
            
            String branch = parts[2];
            
            sales[validCount] = new Sale(date, amount, branch);
            validCount++;
        }
        
        if (validCount == 0) {
            System.out.println("No valid records entered.");
            sc.close();
            return;
        }
        
        // Sort using Merge Sort
        MergeSortSales.sort(sales, 0, validCount - 1);
        
        // Simple & clean output - easy to copy-paste
        System.out.println("\n=== ZIPZIPMART DAILY SALES REPORT ===");
        System.out.println("Date           |    Amount    | Branch");
        System.out.println("-------------------------------------");
        
        for (int i = 0; i < validCount; i++) {
            Sale s = sales[i];
            System.out.printf("%-14s | %11.2f | %s%n",
                             s.date.format(DATE_FORMAT),
                             s.amount,
                             s.branch);
        }
        
        System.out.println("=====================================");
        System.out.println("Total records: " + validCount);
        
        sc.close();
    }
}