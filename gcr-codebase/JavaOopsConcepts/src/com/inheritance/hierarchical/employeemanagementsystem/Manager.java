package com.inheritance.hierarchical.employeemanagementsystem;

public class Manager extends Employee{
	private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();  // Display common details
        System.out.println("Role: Manager");
        System.out.println("Team Size: " + teamSize + " members");
        System.out.println("Bonus: $" + (teamSize * 500));  // Example bonus
        System.out.println("------------------------");
    }
}
