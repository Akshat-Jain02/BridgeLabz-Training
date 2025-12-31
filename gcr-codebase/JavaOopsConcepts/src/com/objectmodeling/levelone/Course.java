package com.objectmodeling.levelone;

import java.util.ArrayList;

public class Course {
	
    String courseName;
    ArrayList<Student> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}
