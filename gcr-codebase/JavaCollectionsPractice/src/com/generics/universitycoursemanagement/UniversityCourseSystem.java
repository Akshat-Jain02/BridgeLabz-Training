package com.generics.universitycoursemanagement;
public class UniversityCourseSystem {
    public static void main(String[] args) {
        Department csDept = new Department("Computer Science");
        
        Course<ExamCourse> algo = new Course<>(
            new ExamCourse("CS301", "Algorithms", 4),
            "Dr. Sharma", 5
        );
        
        Course<AssignmentCourse> webDev = new Course<>(
            new AssignmentCourse("CS402", "Web Development", 3),
            "Prof. Verma", 6
        );
        
        Course<ResearchCourse> mlThesis = new Course<>(
            new ResearchCourse("CS901", "Advanced Machine Learning", 8),
            "Dr. Gupta", 9
        );
        
        csDept.addCourse(algo);
        csDept.addCourse(webDev);
        csDept.addCourse(mlThesis);
        
        csDept.printAllCourses();
        
        System.out.println("Total credits offered: " + csDept.getTotalCredits());
    }
}