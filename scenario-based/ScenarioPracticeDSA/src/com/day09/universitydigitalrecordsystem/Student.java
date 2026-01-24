package com.day09.universitydigitalrecordsystem;

class Student {
    String rollNumber;
    String name;
    String department;
    int year;

    public Student(String rollNumber, String name, String department, int year) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.department = department;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Roll: " + rollNumber + 
               ", Name: " + name + 
               ", Dept: " + department + 
               ", Year: " + year;
    }
}