package com.generics.aidrivenresumescreening;

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        title = "Software Engineer";
    }
    
    boolean isSuitable(Resume resume) {
        return resume.hasSkill("Java") && resume.experience >= 2;
    }
}