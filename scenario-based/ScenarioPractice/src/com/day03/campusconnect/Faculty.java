package com.day03.campusconnect;

class Faculty extends Person {
	
    private String department;

    public Faculty(String name, String email, String id, String department) {
        super(name, email, id);
        this.department = department;
    }

    // Faculty can assign grades to students in their course
    public void assignGrade(Student student, Course course, double grade) {
        if (course.getAssignedFaculty() == this) {
            student.assignGrade(course, grade);
            System.out.println("Grade " + grade + " assigned to " + student.name + " for " + course.getCourseName());
        }
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Role: Faculty");
        System.out.println("Department: " + department);
    }
}