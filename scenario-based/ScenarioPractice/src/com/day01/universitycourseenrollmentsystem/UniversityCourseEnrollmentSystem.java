package com.day01.universitycourseenrollmentsystem;

public class UniversityCourseEnrollmentSystem {
    public static void main(String[] args) {

        Student s1 = new Undergraduate(101, "Rahul");
        Student s2 = new Postgraduate(102, "Anita", "AI");

        Course c1 = new Course("CS101", "Data Structures", 4);

        Enrollment e1 = new Enrollment(s1, c1);
        Enrollment e2 = new Enrollment(s2, c1);

        Faculty faculty = new Faculty("Dr. Mehta");

        faculty.assignGrade(e1, 82);
        faculty.assignGrade(e2, 55);

        System.out.println(s1.getTranscript());
        System.out.println(s2.getTranscript());
    }
}
