package com.constructors.levelone;

public class Manager extends Employee{
	 public Manager(int employeeID, String department, double salary) {
	        super(employeeID, department, salary);
	    }

	    // Method to display employee details
	    public void displayDetails() {
	        System.out.println("Employee ID: " + employeeID);   // public
	        System.out.println("Department: " + department);   // protected
	        System.out.println("Salary: " + getSalary());       // private via public method
	        System.out.println("----------------------");
	    }

	    // Main method
	    public static void main(String[] args) {
	        Manager mgr = new Manager(101, "IT", 50000);

	        mgr.displayDetails();

	        // Modify salary
	        mgr.setSalary(60000);
	        System.out.println("After Salary Update:");
	        mgr.displayDetails();
	    }
}
