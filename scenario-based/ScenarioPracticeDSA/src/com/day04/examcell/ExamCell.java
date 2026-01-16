package com.day04.examcell;

import java.util.Scanner;

public class ExamCell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many students in total? ");
        int n = sc.nextInt();
        
        Student[] students = new Student[n];
        
        System.out.println("\nEnter student details (name roll marks):");
        System.out.println("Example: Rahul 101 89.5\n");
        
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i+1) + ": ");
            String name = sc.next();
            int roll = sc.nextInt();
            double marks = sc.nextDouble();
            
            students[i] = new Student(name, roll, marks);
        }
        
        // Sort using Merge Sort (highest marks first)
        MergeSortRank.sort(students, 0, n-1);
        
        System.out.println("\n=================== STATE RANK LIST ===================");
        System.out.println("Rank   Name           RollNo   Marks");
        System.out.println("------------------------------------------------------");
        
        for (int i = 0; i < n; i++) {
            System.out.printf("%4d   %-14s %6d   %6.2f\n",
                             (i+1), students[i].name, students[i].rollNo, students[i].marks);
        }
        System.out.println("=======================================================");
        
        sc.close();
    }
}