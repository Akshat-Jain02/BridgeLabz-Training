package com.day01.universitycourseenrollmentsystem;

public abstract class Student {

	
    private int studentId;
    private String name;
    private double gpa;   // sensitive internal field

    // Student without electives
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Student with elective preference
    public Student(int studentId, String name, String elective) {
        this(studentId, name);
        System.out.println("Elective chosen: " + elective);
    }

    protected void updateGpa(double newGpa) {
        this.gpa = newGpa;
    }

    public double getGpa() {
        return gpa;
    }

    public String getTranscript() {
        return "Student: " + name + ", GPA: " + gpa;
    }

    public abstract String getProgramType();
}
