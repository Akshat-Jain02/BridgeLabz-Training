package com.generics.universitycoursemanagement;

abstract class CourseType {
    protected String courseCode;
    protected String title;
    protected int credits;
    
    public CourseType(String courseCode, String title, int credits) {
        this.courseCode = courseCode;
        this.title = title;
        this.credits = credits;
    }
    
    public abstract String getEvaluationMethod();
    public abstract double getMaxScore();
    
    public String getDetails() {
        return courseCode + " - " + title + " (" + credits + " credits)";
    }
}