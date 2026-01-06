package com.day03.campusconnect;

import java.util.*;

class Course {
    private String courseCode;
    private String courseName;
    private Faculty assignedFaculty;
    private List<Student> enrolledStudents;

    public Course(String courseCode, String courseName, Faculty faculty) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.assignedFaculty = faculty;
        this.enrolledStudents = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    public void removeStudent(Student student) {
        enrolledStudents.remove(student);
    }

    public String getCourseName() {
        return courseName;
    }

    public Faculty getAssignedFaculty() {
        return assignedFaculty;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void printCourseRoster() {
        System.out.println("Course: " + courseName + " (" + courseCode + ")");
        System.out.println("Faculty: " + (assignedFaculty != null ? assignedFaculty.name : "None"));
        System.out.println("Enrolled Students:");
        for (Student s : enrolledStudents) {
            System.out.println("  - " + s.name);
        }
    }
}