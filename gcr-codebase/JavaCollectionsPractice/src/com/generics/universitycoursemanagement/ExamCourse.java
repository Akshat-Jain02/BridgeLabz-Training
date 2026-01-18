package com.generics.universitycoursemanagement;

class ExamCourse extends CourseType {
    public ExamCourse(String courseCode, String title, int credits) {
        super(courseCode, title, credits);
    }
    
    @Override
    public String getEvaluationMethod() {
        return "Written Final Exam + Midterms";
    }
    
    @Override
    public double getMaxScore() {
        return 100.0;
    }
}