package com.objectmodeling.levelone;

import java.util.ArrayList;

public class StudentNew {

    String name;
    ArrayList<CourseNew> enrolledCourses;

    public StudentNew(String name) {
        this.name = name;
        enrolledCourses = new ArrayList<>();
    }

    // Student communicates with Course
    public void enrollCourse(CourseNew course) {
        enrolledCourses.add(course);
        System.out.println(name + " enrolled in " + course.courseName);
    }
    
}
