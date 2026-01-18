package com.generics.universitycoursemanagement;

class Department {
    private String name;
    private java.util.List<Course<? extends CourseType>> courses;
    
    public Department(String name) {
        this.name = name;
        this.courses = new java.util.ArrayList<>();
    }
    
    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }
    
    // Wildcard usage: works with any Course<? extends CourseType>
    public void printAllCourses() {
        System.out.println("=== " + name + " Department Courses ===");
        for (Course<? extends CourseType> c : courses) {
            System.out.println(c.getFullInfo());
            System.out.println("Max Score: " + c.getCourseType().getMaxScore());
            System.out.println("------------------------");
        }
    }
    
    public int getTotalCredits() {
        int total = 0;
        for (Course<? extends CourseType> c : courses) {
            total += c.getCourseType().credits;
        }
        return total;
    }
}