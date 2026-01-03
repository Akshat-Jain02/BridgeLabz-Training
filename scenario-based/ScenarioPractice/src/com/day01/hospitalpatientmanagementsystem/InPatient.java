package com.day01.hospitalpatientmanagementsystem;

public class InPatient extends Patient{
	 private int daysAdmitted;

	    public InPatient(int id, String name, int daysAdmitted) {
	        super(id, name);
	        this.daysAdmitted = daysAdmitted;
	    }

	    @Override
	    public void displayInfo() {
	        System.out.println(getSummary() +
	                ", Days Admitted: " + daysAdmitted);
	    }
}
