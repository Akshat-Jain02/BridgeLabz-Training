package com.objectmodeling.levelone;

public class Doctor {

    String name;

    public Doctor(String name) {
        this.name = name;
    }

    public void consult(Patient patient) {
        System.out.println("Dr. " + name +
                " is consulting patient " + patient.name);
    }
}
