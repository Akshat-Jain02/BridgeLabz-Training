package com.day01.bookshelf;

import java.util.Scanner;

public class BookShelfApp {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookShelf shelf = new BookShelf();

        // Some sample data
        shelf.addBook("Fiction", new Book("The Alchemist", "Paulo Coelho", "9780062315007"));
        shelf.addBook("Fiction", new Book("1984", "George Orwell", "9780451524935"));
        shelf.addBook("Fantasy", new Book("The Hobbit", "J.R.R. Tolkien", "9780547928227"));
        shelf.addBook("Non-Fiction", new Book("Atomic Habits", "James Clear", "9780735211292"));

        int choice;
        do {
            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. Add New Book");
            System.out.println("2. Borrow Book (by ISBN)");
            System.out.println("3. Return Book (by ISBN)");
            System.out.println("4. View Books by Genre");
            System.out.println("5. View All Books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter genre: ");
                    String genre = sc.nextLine().trim();
                    System.out.print("Enter title: ");
                    String title = sc.nextLine().trim();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine().trim();
                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine().trim();

                    shelf.addBook(genre, new Book(title, author, isbn));
                    break;

                case 2:
                    System.out.print("Enter ISBN to borrow: ");
                    String borrowIsbn = sc.nextLine().trim();
                    shelf.borrowBook(borrowIsbn);
                    break;

                case 3:
                    System.out.print("Enter ISBN to return: ");
                    String returnIsbn = sc.nextLine().trim();
                    shelf.returnBook(returnIsbn);
                    break;

                case 4:
                    System.out.print("Enter genre to view: ");
                    String viewGenre = sc.nextLine().trim();
                    shelf.displayGenre(viewGenre);
                    break;

                case 5:
                    shelf.displayAll();
                    break;

                case 6:
                    System.out.println("Thank you for using BookShelf! Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);

        sc.close();
	}
}
