package com.objectmodeling.levelone;

public class UniversityManagementDemo {
    public static void main(String[] args) {

        StudentNew student = new StudentNew("Rohan");
        Professor professor = new Professor("Dr. Sharma");

        CourseNew javaCourse = new CourseNew("Java Programming");

        student.enrollCourse(javaCourse);
        javaCourse.assignProfessor(professor);
    }
}
