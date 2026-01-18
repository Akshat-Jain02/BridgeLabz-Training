package com.generics.universitycoursemanagement;

class Course<T extends CourseType> {
    private T courseType;
    private String instructor;
    private int semester;
    
    public Course(T courseType, String instructor, int semester) {
        this.courseType = courseType;
        this.instructor = instructor;
        this.semester = semester;
    }
    
    public T getCourseType() {
        return courseType;
    }
    
    public String getFullInfo() {
        return courseType.getDetails() + "\n" +
               "Instructor: " + instructor + "\n" +
               "Semester: " + semester + "\n" +
               "Evaluation: " + courseType.getEvaluationMethod();
    }
}