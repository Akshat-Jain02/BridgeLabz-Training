package com.objectmodeling.levelone;

public class SchoolDemo {

    public static void main(String[] args) {
        School school = new School("Green Valley School");

        Student rohan = new Student("Rohan");
        Student neha = new Student("Neha");

        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        school.addStudent(rohan);
        school.addStudent(neha);

        rohan.enrollCourse(math);
        rohan.enrollCourse(science);
        neha.enrollCourse(science);

        rohan.viewCourses();
        science.showStudents();
    }
    
}
