package com.day06.medistore;

import java.time.LocalDate;
import java.util.Scanner;

public class MediStore {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Medicine Type (1-Tablet, 2-Syrup, 3-Injection): ");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Medicine Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Expiry Date (YYYY-MM-DD): ");
        LocalDate expiryDate = LocalDate.parse(sc.next());

        Medicine medicine = null;

        switch (type) {
            case 1:
                medicine = new Tablet(name, price, expiryDate, quantity);
                break;
            case 2:
                medicine = new Syrup(name, price, expiryDate, quantity);
                break;
            case 3:
                medicine = new Injection(name, price, expiryDate, quantity);
                break;
            default:
                System.out.println("Invalid medicine type!");
                System.exit(0);
        }

        System.out.println("\n--- Medicine Details ---");
        System.out.println("Name: " + medicine.getName());
        System.out.println("Stock: " + medicine.getQuantity());
        System.out.println("Expired: " + medicine.checkExpiry());

        System.out.print("\nEnter quantity to sell: ");
        int sellQty = sc.nextInt();

        try {
            double bill = medicine.sell(sellQty);
            System.out.println("Total Bill: ₹" + bill);
            System.out.println("Remaining Stock: " + medicine.getQuantity());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
