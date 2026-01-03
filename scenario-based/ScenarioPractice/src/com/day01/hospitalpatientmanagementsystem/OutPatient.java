package com.day01.hospitalpatientmanagementsystem;

public class OutPatient extends Patient{
    public OutPatient(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayInfo() {
        System.out.println(getSummary() + ", OPD Patient");
    }
}
