package com.constructors.levelone;


class PostgraduateStudent extends Student {
	    String specialization;

	    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
	        super(rollNumber, name, CGPA);
	        this.specialization = specialization;
	    }

	    // Display details including protected and private (via getter) members
	    public void displayPostgraduateDetails() {
	        System.out.println("Roll Number: " + rollNumber);  // public
	        System.out.println("Name: " + name);              // protected
	        System.out.println("CGPA: " + getCGPA());        // private accessed via public method
	        System.out.println("Specialization: " + specialization);
	        System.out.println("--------------------");
	    }

	    // Main method to test both classes
	    public static void main(String[] args) {
	        // Create Student object
	        Student student1 = new Student(101, "Akshat Jain", 8.5);
	        student1.displayStudentDetails();

	        // Update CGPA
	        student1.setCGPA(9.0);
	        System.out.println("After updating CGPA:");
	        student1.displayStudentDetails();

	        // Create PostgraduateStudent object
	        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Riya Sharma", 9.2, "Computer Science");
	        pgStudent.displayPostgraduateDetails();
	    }
}
