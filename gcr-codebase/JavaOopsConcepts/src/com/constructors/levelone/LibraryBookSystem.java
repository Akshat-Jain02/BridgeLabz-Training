package com.constructors.levelone;

import java.util.Scanner;

public class LibraryBookSystem {
	  // Attributes
    String title;
    String author;
    double price;
    boolean isAvailable;

    // Constructor
    public LibraryBookSystem(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            System.out.println("You have successfully borrowed \"" + title + "\" by " + author + ".");
            isAvailable = false;
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available.");
        }
    }

    // Method to display book info
    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author +
                           ", Price: $" + price + ", Available: " + (isAvailable ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create some books
        LibraryBookSystem book1 = new LibraryBookSystem("The Alchemist", "Paulo Coelho", 350.0, true);
        LibraryBookSystem book2 = new LibraryBookSystem("1984", "George Orwell", 250.0, true);

        // Display books
        System.out.println("Available books in the library:");
        book1.displayInfo();
        book2.displayInfo();

        // Ask user to borrow
        System.out.print("\nEnter the title of the book you want to borrow: ");
        String borrowTitle = sc.nextLine();

        // Borrow logic
        if (borrowTitle.equalsIgnoreCase(book1.title)) {
            book1.borrowBook();
        } else if (borrowTitle.equalsIgnoreCase(book2.title)) {
            book2.borrowBook();
        } else {
            System.out.println("Book not found in the library.");
        }

        // Updated status
        System.out.println("\nUpdated library status:");
        book1.displayInfo();
        book2.displayInfo();

        sc.close();
    }
}
