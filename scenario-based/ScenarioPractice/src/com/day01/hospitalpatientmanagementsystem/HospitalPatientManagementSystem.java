package com.day01.hospitalpatientmanagementsystem;

public class HospitalPatientManagementSystem {
    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Kumar", 5);
        Patient p2 = new OutPatient(102, "Aman");

        Doctor doctor = new Doctor(1, "Dr. Sharma", "Cardiology");

        Payable bill = new Bill(500, 1200);

        p1.displayInfo();   // Polymorphism
        p2.displayInfo();

        doctor.displayInfo();

        System.out.println("Total Bill Amount: ₹" + bill.calculatePayment());
    }
}
