package com.day05.robowarehouse;

import java.util.Scanner;

public class RoboWarehouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== RoboWarehouse - Smart Shelf Loading Robot ===\n");

        System.out.print("Enter maximum shelf capacity: ");
        int capacity = sc.nextInt();
        sc.nextLine(); // consume newline

        Shelf shelf = new Shelf(capacity);

        System.out.println("\nEnter packages (format: ID weight)");
        System.out.println("Examples: P001 4.5    PXL12 2.3    Q7 7.8");
        System.out.println("Type 'done' when finished\n");

        int packageCount = 0;

        while (true) {
            System.out.print("Package " + (packageCount + 1) + " → ");
            String input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                String[] parts = input.split("\\s+");
                if (parts.length != 2) {
                    System.out.println("Invalid format! Use: ID weight (example: BOX1 5.2)");
                    continue;
                }

                String id = parts[0];
                double weight = Double.parseDouble(parts[1]);

                if (weight <= 0) {
                    System.out.println("Weight must be positive!");
                    continue;
                }

                Package pkg = new Package(id, weight);
                boolean success = shelf.addPackage(pkg);

                if (success) {
                    packageCount++;
                    shelf.displayShelf();
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid weight! Please enter a number.");
            }
        }

        System.out.println("\n=== Final Warehouse Status ===");
        System.out.println("Total packages loaded: " + packageCount + "/" + capacity);
        shelf.displayShelf();

        System.out.println("RoboWarehouse shutting down. Shelf is balanced! ✓\n");
        sc.close();
    }
}