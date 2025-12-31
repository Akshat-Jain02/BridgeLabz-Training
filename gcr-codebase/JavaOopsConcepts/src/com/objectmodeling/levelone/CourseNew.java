package com.objectmodeling.levelone;

public class CourseNew {
    String courseName;
    Professor professor;

    public CourseNew(String courseName) {
        this.courseName = courseName;
    }

    // Course communicates with Professor
    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println(professor.name + " assigned to " + courseName);
    }
}
