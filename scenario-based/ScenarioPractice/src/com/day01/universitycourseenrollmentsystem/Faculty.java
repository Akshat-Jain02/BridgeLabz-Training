package com.day01.universitycourseenrollmentsystem;

public class Faculty implements Graded{
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    @Override
    public void assignGrade(Enrollment enrollment, double marks) {

        Student student = enrollment.getStudent();
        double gradePoint;

        // Polymorphic behavior based on student type
        if (student instanceof Undergraduate) {
            gradePoint = (marks >= 90) ? 4.0 :
                         (marks >= 75) ? 3.0 :
                         (marks >= 60) ? 2.0 : 0.0;
        } else {
            gradePoint = (marks >= 50) ? 3.0 : 0.0; // pass/fail
        }

        enrollment.setGradePoint(gradePoint);
        System.out.println("Grade assigned by " + name);
    }
}
