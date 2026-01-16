package com.day04.hospitalqueue;

import java.util.Scanner;

public class HospitalQueue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients: ");
        int patientCount = sc.nextInt();

        Patient[] patients = new Patient[patientCount];

        for (int i = 0; i < patientCount; i++) {
            System.out.print("Enter patient name: ");
            String name = sc.next();

            System.out.print("Enter criticality level (1-10): ");
            int criticality = sc.nextInt();

            patients[i] = new Patient(name, criticality);
        }

        PatientSorter sorter = new PatientSorter();
        sorter.sortByCriticality(patients);

        System.out.println("\nPatients sorted by criticality:");
        for (Patient patient : patients) {
            System.out.println(
                patient.getName() + " - " + patient.getCriticalityLevel()
            );
        }

        sc.close();
    }
}