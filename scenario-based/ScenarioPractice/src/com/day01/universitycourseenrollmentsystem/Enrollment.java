package com.day01.universitycourseenrollmentsystem;

public class Enrollment {
    private Student student;
    private Course course;
    private double gradePoint;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void setGradePoint(double gradePoint) {
        this.gradePoint = gradePoint;
        student.updateGpa(gradePoint); // simple GPA logic
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }
}
