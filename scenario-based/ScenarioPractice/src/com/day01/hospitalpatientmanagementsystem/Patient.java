package com.day01.hospitalpatientmanagementsystem;

public class Patient {

    private int patientId;
    private String name;
    private String medicalHistory;   // sensitive data
    protected String patientType;

    // Normal admission
    public Patient(int patientId, String name) {
        this.patientId = patientId;
        this.name = name;
        this.patientType = "Normal";
    }

    // Emergency admission (constructor overloading)
    public Patient(int patientId, String name, String medicalHistory) {
        this(patientId, name);
        this.medicalHistory = medicalHistory;
        this.patientType = "Emergency";
    }

    public String getSummary() {
        return "Patient ID: " + patientId +
               ", Name: " + name +
               ", Type: " + patientType;
    }

    public void displayInfo() {
        System.out.println(getSummary());
    }
}
