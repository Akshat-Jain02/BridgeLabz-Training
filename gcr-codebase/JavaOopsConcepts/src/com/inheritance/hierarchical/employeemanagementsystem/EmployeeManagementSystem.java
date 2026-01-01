package com.inheritance.hierarchical.employeemanagementsystem;

public class EmployeeManagementSystem {
	public static void main(String[] args) {
        // Create different types of employees
        Employee manager = new Manager("Alice Johnson", 101, 120000, 12);
        Employee developer = new Developer("Bob Smith", 102, 90000, "Java");
        Employee intern = new Intern("Charlie Brown", 103, 30000, "Stanford University", 6);

        System.out.println("=== Employee Management System ===\n");

        System.out.println("Manager Details:");
        manager.displayDetails();

        System.out.println("Developer Details:");
        developer.displayDetails();

        System.out.println("Intern Details:");
        intern.displayDetails();

        // Polymorphism: Store employees in an array
        System.out.println("All Employees (Polymorphic View):");
        Employee[] employees = {manager, developer, intern};
        
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
