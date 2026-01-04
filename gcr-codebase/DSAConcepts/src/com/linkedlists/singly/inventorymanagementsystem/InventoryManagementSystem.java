package com.linkedlists.singly.inventorymanagementsystem;

import java.util.Scanner;

public class InventoryManagementSystem {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        InventoryLinkedList inventory = new InventoryLinkedList();
        int choice;

        do {
            System.out.println("\n--- Inventory Menu ---");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Remove by Item ID");
            System.out.println("5. Update Quantity");
            System.out.println("6. Search by Item ID");
            System.out.println("7. Search by Item Name");
            System.out.println("8. Total Inventory Value");
            System.out.println("9. Sort by Name (Asc)");
            System.out.println("10. Sort by Name (Desc)");
            System.out.println("11. Sort by Price (Asc)");
            System.out.println("12. Sort by Price (Desc)");
            System.out.println("13. Display All");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Item ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Item Name: ");
                    String name = sc.nextLine();
                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    if (choice == 1)
                        inventory.addAtBeginning(id, name, qty, price);
                    else if (choice == 2)
                        inventory.addAtEnd(id, name, qty, price);
                    else {
                        System.out.print("Position: ");
                        int pos = sc.nextInt();
                        inventory.addAtPosition(pos, id, name, qty, price);
                    }
                    break;

                case 4:
                    System.out.print("Enter Item ID: ");
                    inventory.removeById(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter Item ID: ");
                    int i = sc.nextInt();
                    System.out.print("New Quantity: ");
                    inventory.updateQuantity(i, sc.nextInt());
                    break;

                case 6:
                    System.out.print("Enter Item ID: ");
                    inventory.searchById(sc.nextInt());
                    break;

                case 7:
                    System.out.print("Enter Item Name: ");
                    inventory.searchByName(sc.nextLine());
                    break;

                case 8:
                    inventory.totalInventoryValue();
                    break;

                case 9:
                    inventory.sortByName(true);
                    break;

                case 10:
                    inventory.sortByName(false);
                    break;

                case 11:
                    inventory.sortByPrice(true);
                    break;

                case 12:
                    inventory.sortByPrice(false);
                    break;

                case 13:
                    inventory.displayAll();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}