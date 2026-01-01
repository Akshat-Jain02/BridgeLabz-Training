package com.inheritance.multilevel.educationalcourse;

public class EducationalCourse {
	public static void main(String[] args) {
        // Level 1: Basic Course
        Course basic = new Course("Mathematics 101", 12);

        // Level 2: Online Course
        OnlineCourse freeOnline = new OnlineCourse(
            "Java Programming", 8, "YouTube", true);

        // Level 3: Paid Online Course
        PaidOnlineCourse paid = new PaidOnlineCourse(
            "Full Stack Web Development", 16, "Udemy", true, 199.99, 30);

        System.out.println("=== Educational Course Hierarchy ===\n");

        System.out.println("1. General Course:");
        basic.displayInfo();

        System.out.println("2. Free Online Course:");
        freeOnline.displayInfo();

        System.out.println("3. Paid Online Course:");
        paid.displayInfo();

        // Polymorphism demo
        System.out.println("All Courses (viewed as base type):");
        Course[] courses = {basic, freeOnline, paid};
        for (Course c : courses) {
            System.out.print(c.courseName + " → ");
            c.displayInfo();
        }
    }
}
