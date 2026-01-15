package com.day03.parceltracker;
import java.util.Scanner;

public class SimpleParcelTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("     PARCEL TRACKER - SIMPLE    ");
        System.out.println("=================================\n");

        System.out.print("Parcel ID : ");
        String parcelId = sc.nextLine().trim();

        System.out.print("Sender    : ");
        String sender = sc.nextLine().trim();

        System.out.print("Receiver  : ");
        String receiver = sc.nextLine().trim();

        Parcel parcel = new Parcel(parcelId, sender, receiver);
        parcel.addStatus("Order Received", "Processing Center");

        int choice;
        do {
            System.out.println("\n1. Add new status");
            System.out.println("2. Show full history");
            System.out.println("3. Show current status");
            System.out.println("4. Mark as Delivered");
            System.out.println("5. Mark as LOST");
            System.out.println("6. Exit");
            System.out.print("Choice: ");

            // Simple input handling - no hasNextInt()
            String input = sc.nextLine().trim();
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number!");
                choice = 0; // loop continues
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Status: ");
                    String status = sc.nextLine().trim();
                    
                    System.out.print("Location (optional): ");
                    String location = sc.nextLine().trim();
                    
                    parcel.addStatus(status, location);
                    System.out.println("Status added!");
                    break;

                case 2:
                    parcel.printHistory();
                    break;

                case 3:
                    System.out.println("Current status: " + parcel.getCurrentStatus());
                    if (parcel.isDelivered()) {
                        System.out.println("✓ Delivered!");
                    }
                    break;

                case 4:
                    parcel.addStatus("Delivered", "Receiver's Address");
                    System.out.println("✓ Marked as DELIVERED");
                    break;

                case 5:
                    parcel.markAsLost();
                    System.out.println("!!! PARCEL MARKED AS LOST !!!");
                    break;

                case 6:
                    System.out.println("\nThank you! Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}