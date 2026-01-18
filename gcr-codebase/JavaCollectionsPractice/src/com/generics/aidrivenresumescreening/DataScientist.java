package com.generics.aidrivenresumescreening;

class DataScientist extends JobRole {
    public DataScientist() {
        title = "Data Scientist";
    }
    
    boolean isSuitable(Resume resume) {
        return resume.hasSkill("Python") && resume.experience >= 1;
    }
}