package com.generics.universitycoursemanagement;
class ResearchCourse extends CourseType {
    public ResearchCourse(String courseCode, String title, int credits) {
        super(courseCode, title, credits);
    }
    
    @Override
    public String getEvaluationMethod() {
        return "Thesis + Presentation + Viva";
    }
    
    @Override
    public double getMaxScore() {
        return 200.0;
    }
}