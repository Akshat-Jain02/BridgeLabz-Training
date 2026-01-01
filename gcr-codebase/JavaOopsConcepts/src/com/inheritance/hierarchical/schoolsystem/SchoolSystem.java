package com.inheritance.hierarchical.schoolsystem;

public class SchoolSystem {
	public static void main(String[] args) {
        System.out.println("=== School System Hierarchy ===\n");

        // Create different people
        Person teacher = new Teacher("Mr. Johnson", 45, "Mathematics", 15);
        Person student = new Student("Alice Smith", 16, "10th Grade", "STU001");
        Person staff = new Staff("Mrs. Brown", 38, "Administration", "Secretary");

        // Polymorphic array
        Person[] schoolMembers = {teacher, student, staff};

        for (Person person : schoolMembers) {
            person.showDetails();
        }
    }
}
