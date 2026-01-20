package com.day07.eduresults;

class Student {
    private String name;
    private int rollNumber;
    private int marks;
    private String district;

    public Student(String name, int rollNumber, int marks, String district) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.district = district;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getDistrict() {
        return district;
    }

    @Override
    public String toString() {
        return String.format("%-8d | %-20s | %-10s | %4d", 
                             rollNumber, name, district, marks);
    }
}