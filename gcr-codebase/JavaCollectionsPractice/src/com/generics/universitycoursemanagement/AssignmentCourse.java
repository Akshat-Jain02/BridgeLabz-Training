package com.generics.universitycoursemanagement;

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseCode, String title, int credits) {
        super(courseCode, title, credits);
    }
    
    @Override
    public String getEvaluationMethod() {
        return "Multiple Assignments + Project";
    }
    
    @Override
    public double getMaxScore() {
        return 150.0;
    }
}