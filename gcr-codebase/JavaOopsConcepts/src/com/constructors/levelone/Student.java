package com.constructors.levelone;

public class Student {
	    public int rollNumber;      // Public
	    protected String name;      // Protected
	    private double CGPA;        // Private

	    // Constructor
	    public Student(int rollNumber, String name, double CGPA) {
	        this.rollNumber = rollNumber;
	        this.name = name;
	        this.CGPA = CGPA;
	    }

	    // Public getter for CGPA
	    public double getCGPA() {
	        return CGPA;
	    }

	    // Public setter for CGPA
	    public void setCGPA(double CGPA) {
	        if(CGPA >= 0.0 && CGPA <= 10.0) {
	            this.CGPA = CGPA;
	        } else {
	            System.out.println("Invalid CGPA. Must be between 0 and 10.");
	        }
	    }

	    // Method to display student details
	    public void displayStudentDetails() {
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Name: " + name);
	        System.out.println("CGPA: " + CGPA);
	        System.out.println("--------------------");
	    }
}
