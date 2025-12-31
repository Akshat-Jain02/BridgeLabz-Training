package com.objectmodeling.levelone;

public class UniversityDemo {
	
    public static void main(String[] args) {

        University university = new University("National University");

        // Faculty exists independently
        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Mehta");

        university.addFaculty(f1);
        university.addFaculty(f2);

        // Departments created inside University
        university.addDepartment("Computer Science");
        university.addDepartment("Mechanical");

        // Closing University
        university.closeUniversity();

        // Faculty still exists
        System.out.println("Faculty still exists: " + f1.name);
    }
    
}
