package com.day03.campusconnect;
import java.util.Scanner;


public class CampusConnect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Faculty
        System.out.println("Enter Faculty Details:");
        System.out.print("Name: ");
        String facultyName = scanner.nextLine();
        System.out.print("Email: ");
        String facultyEmail = scanner.nextLine();
        System.out.print("ID: ");
        String facultyId = scanner.nextLine();
        System.out.print("Department: ");
        String department = scanner.nextLine();

        Faculty prof = new Faculty(facultyName, facultyEmail, facultyId, department);

        // Input for Course
        System.out.println("\nEnter Course Details:");
        System.out.print("Course Code: ");
        String courseCode = scanner.nextLine();
        System.out.print("Course Name: ");
        String courseName = scanner.nextLine();

        Course course = new Course(courseCode, courseName, prof);

        // Input for Student
        System.out.println("\nEnter Student Details:");
        System.out.print("Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Email: ");
        String studentEmail = scanner.nextLine();
        System.out.print("ID: ");
        String studentId = scanner.nextLine();

        Student student = new Student(studentName, studentEmail, studentId);

        // Enroll the student
        student.enrollCourse(course);

        // Assign a grade (faculty assigns)
        System.out.println("\nEnter grade for " + studentName + " in " + courseName + " (0.0 - 4.0):");
        double grade = scanner.nextDouble();
        prof.assignGrade(student, course, grade);

        // Print details using polymorphism
        System.out.println("\n=== Faculty Details ===");
        prof.printDetails();

        System.out.println("\n=== Student Details ===");
        student.printDetails();

        System.out.println("\n=== Course Roster ===");
        course.printCourseRoster();

        // Optional: Drop course demonstration
        System.out.println("\nDo you want to drop the course? (yes/no):");
        scanner.nextLine(); // consume newline
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            student.dropCourse(course);
            System.out.println("\nAfter dropping the course:");
            student.printDetails();
        }

        scanner.close();
    }
}