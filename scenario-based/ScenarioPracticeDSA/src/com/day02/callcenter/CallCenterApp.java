package com.day02.callcenter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CallCenterApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CallCenterManager manager = new CallCenterManager();

        while (true) {
            System.out.println("\n=== Telecom Call Center System ===");
            System.out.println("1. New Call");
            System.out.println("2. Serve Next Customer");
            System.out.println("3. Show Statistics");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number!");
                sc.nextLine();
                continue;
            }
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Customer name: ");
                    String name = sc.nextLine().trim();
                    if (name.isEmpty()) {
                        System.out.println("Name cannot be empty!");
                        break;
                    }

                    System.out.print("Is VIP customer? (y/n): ");
                    String vipInput = sc.nextLine().trim().toLowerCase();
                    boolean isVip = vipInput.equals("y") || vipInput.equals("yes");

                    manager.addCall(name, isVip);
                }

                case 2 -> manager.serveNext();

                case 3 -> manager.showStatistics();

                case 4 -> {
                    System.out.println("Thank you! Shutting down...");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid option! Please choose 1-4.");
            }
        }
    }
}