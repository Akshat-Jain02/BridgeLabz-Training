package com.day09.birdsanctuary;

import java.util.Scanner;

public class BirdSanctuarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BirdSanctuary sanctuary = new BirdSanctuary();
        boolean running = true;

        while (running) {
            System.out.println("\nWelcome to EcoWing Bird Sanctuary");
            System.out.println("1. Add Bird");
            System.out.println("2. Display All Birds");
            System.out.println("3. Display All Flying Birds");
            System.out.println("4. Display All Swimming Birds");
            System.out.println("5. Display Both Flying & Swimming Birds");
            System.out.println("6. Delete Bird by ID");
            System.out.println("7. Sanctuary Report");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter bird type (eagle, sparrow, duck, penguin, seagull, kiwi, ostrich): ");
                    String type = scanner.nextLine();
                    System.out.print("Enter bird name: ");
                    String name = scanner.nextLine();
                    sanctuary.addBird(type, name);
                    break;
                case 2:
                    sanctuary.displayAllBirds();
                    break;
                case 3:
                    sanctuary.displayFlyingBirds();
                    break;
                case 4:
                    sanctuary.displaySwimmingBirds();
                    break;
                case 5:
                    sanctuary.displayBoth();
                    break;
                case 6:
                    System.out.print("Enter bird ID to delete: ");
                    String id = scanner.nextLine();
                    sanctuary.removeBirdById(id);
                    break;
                case 7:
                    sanctuary.showReport();
                    break;
                case 8:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }
}