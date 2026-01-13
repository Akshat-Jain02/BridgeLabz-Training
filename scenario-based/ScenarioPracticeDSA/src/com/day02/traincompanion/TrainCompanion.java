package com.day02.traincompanion;

import java.util.Scanner;

public class TrainCompanion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Train train = new Train();

        // Some initial setup
        train.addCompartmentAtEnd("Engine", false, false);
        train.addCompartmentAtEnd("S1", true, false);
        train.addCompartmentAtEnd("S2", true, false);
        train.addCompartmentAtEnd("Pantry", false, true);
        train.addCompartmentAtEnd("B1", true, false);
        train.addCompartmentAtEnd("Guard", false, false);

        while (true) {
            System.out.println("\n=== Train Companion - Compartment Navigation ===");
            System.out.println("1. Display full train");
            System.out.println("2. Show current + adjacent compartments");
            System.out.println("3. Find nearest Pantry / WiFi");
            System.out.println("4. Add new compartment at end");
            System.out.println("5. Insert compartment after another");
            System.out.println("6. Remove a compartment");
            System.out.println("0. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> train.displayTrainForward();

                case 2 -> {
                    System.out.print("Your current compartment (e.g. S1, Pantry): ");
                    String current = sc.nextLine().trim();
                    train.showCurrentAndNeighbors(current);
                }

                case 3 -> {
                    System.out.print("What are you looking for? (pantry / wifi): ");
                    String service = sc.nextLine().trim();
                    train.findNearestService(service);
                }

                case 4 -> {
                    System.out.print("New compartment name: ");
                    String name = sc.nextLine().trim();
                    System.out.print("Has WiFi? (y/n): ");
                    boolean wifi = sc.nextLine().trim().equalsIgnoreCase("y");
                    System.out.print("Has Pantry? (y/n): ");
                    boolean pantry = sc.nextLine().trim().equalsIgnoreCase("y");
                    train.addCompartmentAtEnd(name, wifi, pantry);
                }

                case 5 -> {
                    System.out.print("Insert after which compartment: ");
                    String after = sc.nextLine().trim();
                    System.out.print("New compartment name: ");
                    String name = sc.nextLine().trim();
                    System.out.print("Has WiFi? (y/n): ");
                    boolean wifi = sc.nextLine().trim().equalsIgnoreCase("y");
                    System.out.print("Has Pantry? (y/n): ");
                    boolean pantry = sc.nextLine().trim().equalsIgnoreCase("y");
                    train.insertAfter(after, name, wifi, pantry);
                }

                case 6 -> {
                    System.out.print("Compartment to remove: ");
                    String name = sc.nextLine().trim();
                    train.removeCompartment(name);
                }

                case 0 -> {
                    System.out.println("Thank you for using Train Companion. Safe journey!");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }
}