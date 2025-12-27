package com.constructors.levelone;

import java.util.Scanner;

public class Course {
	 // Class variable (common for all courses)
    static String instituteName = "ABC Institute";

    // Instance variables
    String courseName;
    String duration;
    double fee;

    // Constructor to initialize instance variables
    public Course(String courseName, String duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
        System.out.println("-------------------------");
    }

    // Class method to update institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    // Main method inside the same class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create courses
        Course course1 = new Course("Java Programming", "3 months", 15000);
        Course course2 = new Course("Data Science", "6 months", 40000);

        // Display course details before updating institute name
        System.out.println("Before updating institute name:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        // Update institute name
        System.out.print("Enter new institute name: ");
        String newInstitute = sc.nextLine();
        Course.updateInstituteName(newInstitute);

        // Display course details after updating institute name
        System.out.println("After updating institute name:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        sc.close();
    }
}
