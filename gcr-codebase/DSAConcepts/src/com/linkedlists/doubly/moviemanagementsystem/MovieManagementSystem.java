package com.linkedlists.doubly.moviemanagementsystem;

import java.util.Scanner;

public class MovieManagementSystem {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        MovieDoublyLinkedList list = new MovieDoublyLinkedList();
        
        int choice;

        do {
            System.out.println("\n--- Movie Management Menu ---");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Remove by Title");
            System.out.println("5. Search by Director");
            System.out.println("6. Search by Rating");
            System.out.println("7. Update Rating");
            System.out.println("8. Display Forward");
            System.out.println("9. Display Reverse");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Director: ");
                    String director = sc.nextLine();
                    System.out.print("Year: ");
                    int year = sc.nextInt();
                    System.out.print("Rating: ");
                    double rating = sc.nextDouble();

                    if (choice == 1)
                        list.addAtBeginning(title, director, year, rating);
                    else if (choice == 2)
                        list.addAtEnd(title, director, year, rating);
                    else {
                        System.out.print("Position: ");
                        int pos = sc.nextInt();
                        list.addAtPosition(pos, title, director, year, rating);
                    }
                    break;

                case 4:
                    System.out.print("Enter movie title to remove: ");
                    list.removeByTitle(sc.nextLine());
                    break;

                case 5:
                    System.out.print("Enter director name: ");
                    list.searchByDirector(sc.nextLine());
                    break;

                case 6:
                    System.out.print("Enter rating: ");
                    list.searchByRating(sc.nextDouble());
                    break;

                case 7:
                    System.out.print("Enter movie title: ");
                    String t = sc.nextLine();
                    System.out.print("New rating: ");
                    double r = sc.nextDouble();
                    list.updateRating(t, r);
                    break;

                case 8:
                    list.displayForward();
                    break;

                case 9:
                    list.displayReverse();
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