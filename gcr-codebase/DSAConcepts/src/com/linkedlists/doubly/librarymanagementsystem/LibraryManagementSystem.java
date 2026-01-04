package com.linkedlists.doubly.librarymanagementsystem;

import java.util.Scanner;

public class LibraryManagementSystem {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();
        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book at Beginning");
            System.out.println("2. Add Book at End");
            System.out.println("3. Add Book at Position");
            System.out.println("4. Remove Book by ID");
            System.out.println("5. Search by Title");
            System.out.println("6. Search by Author");
            System.out.println("7. Update Availability");
            System.out.println("8. Display Forward");
            System.out.println("9. Display Reverse");
            System.out.println("10. Count Total Books");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    System.out.print("Genre: ");
                    String genre = sc.nextLine();
                    System.out.print("Available (true/false): ");
                    boolean status = sc.nextBoolean();

                    if (choice == 1)
                        library.addAtBeginning(title, author, genre, id, status);
                    else if (choice == 2)
                        library.addAtEnd(title, author, genre, id, status);
                    else {
                        System.out.print("Position: ");
                        int pos = sc.nextInt();
                        library.addAtPosition(pos, title, author, genre, id, status);
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID: ");
                    library.removeById(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter Title: ");
                    library.searchByTitle(sc.nextLine());
                    break;

                case 6:
                    System.out.print("Enter Author: ");
                    library.searchByAuthor(sc.nextLine());
                    break;

                case 7:
                    System.out.print("Enter Book ID: ");
                    int bid = sc.nextInt();
                    System.out.print("Availability (true/false): ");
                    library.updateAvailability(bid, sc.nextBoolean());
                    break;

                case 8:
                    library.displayForward();
                    break;

                case 9:
                    library.displayReverse();
                    break;

                case 10:
                    System.out.println("Total Books: " + library.countBooks());
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