package com.day09.medwarehouse;

import java.time.LocalDate;

public class MedWarehouse {
    
    private static void print(String title, Medicine[] arr) {
        System.out.println(title);
        for (Medicine m : arr) {
            System.out.println("  " + m);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Medicine[] medicines = {
            new Medicine("Paracetamol 500mg", LocalDate.of(2026, 2, 28)),
            new Medicine("Amoxicillin 250mg", LocalDate.of(2026, 3, 15)),
            new Medicine("Cetirizine 10mg",   LocalDate.of(2026, 4, 5)),
            new Medicine("Ibuprofen 400mg",   LocalDate.of(2026, 6, 30)),
            new Medicine("Metformin 500mg",   LocalDate.of(2026, 7, 20)),
            new Medicine("Pantop 40mg",       LocalDate.of(2026, 9, 10))
        };
        
        print("Before sorting:", medicines);
        
        MedicineSorter.sort(medicines);
        
        print("After Merge Sort (earliest expiry first):", medicines);
    }
}