package com.objectmodeling.levelone;

public class HospitalDemo {

    public static void main(String[] args) {

        Doctor d1 = new Doctor("Amit");
        Doctor d2 = new Doctor("Neha");

        Patient p1 = new Patient("Ravi");
        Patient p2 = new Patient("Suman");

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);
    }
    
}
