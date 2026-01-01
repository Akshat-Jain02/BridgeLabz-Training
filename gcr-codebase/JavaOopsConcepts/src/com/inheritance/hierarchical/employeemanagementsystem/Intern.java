package com.inheritance.hierarchical.employeemanagementsystem;

public class Intern extends Employee{
	private String university;
    private int durationMonths;

    public Intern(String name, int id, double salary, String university, int durationMonths) {
        super(name, id, salary);
        this.university = university;
        this.durationMonths = durationMonths;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern");
        System.out.println("University: " + university);
        System.out.println("Internship Duration: " + durationMonths + " months");
        System.out.println("------------------------");
    }
}
