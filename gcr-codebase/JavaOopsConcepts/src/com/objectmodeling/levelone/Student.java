package com.objectmodeling.levelone;

import java.util.ArrayList;

public class Student {

    String name;
    ArrayList<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public void viewCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println(c.courseName);
        }
    }
    
}
