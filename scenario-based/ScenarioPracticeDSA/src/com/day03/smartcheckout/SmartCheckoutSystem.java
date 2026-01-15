package com.day03.smartcheckout;

import java.util.*;

public class SmartCheckoutSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckoutCounter counter = new CheckoutCounter();
        
        counter.initializeInventory();
        System.out.println("\n=== SMART CHECKOUT SYSTEM ===\n");

        int choice;
        do {
            System.out.println("\n1. Add customer to queue");
            System.out.println("2. Process next customer");
            System.out.println("3. Show current queue");
            System.out.println("4. Show inventory");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            
            choice = getValidInt(sc);
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addCustomer(sc, counter);
                    break;
                case 2:
                    counter.processNextCustomer();
                    break;
                case 3:
                    counter.showQueue();
                    break;
                case 4:
                    counter.showInventory();
                    break;
                case 5:
                    System.out.println("\nThank you for using SmartCheckout! Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }

    private static void addCustomer(Scanner sc, CheckoutCounter counter) {
        System.out.print("Customer name: ");
        String name = sc.nextLine().trim();

        List<String> items = new ArrayList<>();
        System.out.println("Enter items (type 'done' when finished):");

        while (true) {
            System.out.print("Item: ");
            String item = sc.nextLine().trim();
            if (item.equalsIgnoreCase("done")) break;
            if (!item.isEmpty()) {
                items.add(item);
            }
        }

        if (items.isEmpty()) {
            System.out.println("No items entered → customer not added.");
        } else {
            Customer customer = new Customer(name, items);
            counter.addCustomer(customer);
        }
    }

    private static int getValidInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Please enter a number: ");
            sc.next();
        }
        return sc.nextInt();
    }
}