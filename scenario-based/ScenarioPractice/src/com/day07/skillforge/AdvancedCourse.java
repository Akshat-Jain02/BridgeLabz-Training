package com.day07.skillforge;

class AdvancedCourse extends Course {
	
    AdvancedCourse(String title, Instructor instructor, String[] modules) {
        super(title, instructor, modules);
    }

    @Override
    public void generateCertificate() {
        System.out.println("Advanced Skill Certificate with Project Excellence");
    }
}
