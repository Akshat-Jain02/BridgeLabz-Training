package com.day09.payxpress;

import java.util.Scanner;
import java.time.LocalDate;

public class PayXpress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PayXpress - Utility Bill System ===\n");

        System.out.print("Enter bill type (1-Electricity, 2-Water, 3-Internet): ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter amount (₹): ");
        double amount = sc.nextDouble();

        System.out.print("Enter due date (yyyy-mm-dd): ");
        String dateStr = sc.next();
        LocalDate dueDate = LocalDate.parse(dateStr);

        Bill bill = null;

        switch (choice) {
            case 1:
                bill = new ElectricityBill(amount, dueDate);
                break;
            case 2:
                bill = new WaterBill(amount, dueDate);
                break;
            case 3:
                bill = new InternetBill(amount, dueDate);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println("\nBill created successfully!\n");

        while (true) {
            System.out.println("1. Send Reminder");
            System.out.println("2. Pay Bill");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int option = sc.nextInt();

            if (option == 1) {
                ((IPayable) bill).sendReminder();
            } else if (option == 2) {
                ((IPayable) bill).pay();
            } else if (option == 3) {
                System.out.println("Thank you for using PayXpress!");
                break;
            } else {
                System.out.println("Invalid option!");
            }
            System.out.println();
        }

        sc.close();
    }
}