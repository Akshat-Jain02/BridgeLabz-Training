package com.day03.campusconnect;

import java.util.*;

class Student extends Person implements ICourseActions {
	
    private Map<Course, Double> grades; // Course -> grade (0.0 - 4.0 scale)
    private List<Course> enrolledCourses;

    public Student(String name, String email, String id) {
        super(name, email, id);
        this.grades = new HashMap<>();
        this.enrolledCourses = new ArrayList<>();
    }

    @Override
    public void enrollCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.addStudent(this);
            System.out.println(name + " enrolled in " + course.getCourseName());
        } else {
            System.out.println(name + " is already enrolled in " + course.getCourseName());
        }
    }

    @Override
    public void dropCourse(Course course) {
        if (enrolledCourses.remove(course)) {
            course.removeStudent(this);
            grades.remove(course);
            System.out.println(name + " dropped " + course.getCourseName());
        } else {
            System.out.println(name + " is not enrolled in " + course.getCourseName());
        }
    }

    // Package-private or public setter to assign grade (called by Faculty/Course)
    void assignGrade(Course course, double grade) {
        if (enrolledCourses.contains(course) && grade >= 0.0 && grade <= 4.0) {
            grades.put(course, grade);
        }
    }

    // Calculate GPA using overloaded + operator concept (here via method)
    public double calculateGPA() {
        if (grades.isEmpty()) return 0.0;
        double total = 0.0;
        for (double g : grades.values()) {
            total += g;
        }
        return total / grades.size();
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Role: Student");
        System.out.println("Enrolled Courses: ");
        for (Course c : enrolledCourses) {
            System.out.println("  - " + c.getCourseName());
        }
        System.out.printf("GPA: %.2f%n", calculateGPA());
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }
}