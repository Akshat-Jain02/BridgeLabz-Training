package com.day07.skillforge;

import java.util.Scanner;

public class SkillForge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Instructor input
        System.out.print("Enter Instructor Name: ");
        Instructor instructor = new Instructor(sc.nextLine());

        // Course input
        System.out.print("Enter Course Title: ");
        String courseTitle = sc.nextLine();

        System.out.print("Enter number of modules: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] modules = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Module " + (i + 1) + ": ");
            modules[i] = sc.nextLine();
        }

        Course course = new AdvancedCourse(courseTitle, instructor, modules);

        // Student input
        System.out.print("Enter Student Name: ");
        Student student = new Student(sc.nextLine(), course);

        // Progress tracking
        for (int i = 0; i < n; i++) {
            student.completeModule();
        }

        System.out.println("Progress: " + student.getProgress() + "%");
        student.generateCertificate();
        course.generateCertificate();

        sc.close();
    }
}
