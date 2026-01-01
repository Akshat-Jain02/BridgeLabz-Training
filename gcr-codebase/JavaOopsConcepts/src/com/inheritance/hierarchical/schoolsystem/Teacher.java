package com.inheritance.hierarchical.schoolsystem;

public class Teacher extends Person{
	private String subject;
    private int yearsOfExperience;

    public Teacher(String name, int age, String subject, int yearsOfExperience) {
        super(name, age);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
        System.out.println("Experience: " + yearsOfExperience + " years");
    }
}
