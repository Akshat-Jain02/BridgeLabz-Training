package com.day06.smartlibrary;
import java.util.*;

public class SmartLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList myBooks = new BookList();

        System.out.println("=====================================");
        System.out.println("     SMART LIBRARY - YOUR BORROWED BOOKS    ");
        System.out.println("    (Books are always kept sorted)         ");
        System.out.println("=====================================\n");

        while (true) {
            System.out.println("\n1. Issue new book");
            System.out.println("2. Show my books (sorted)");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 3) {
                break;
            }

            if (choice == 1) {
                System.out.print("Book title: ");
                String title = sc.nextLine().trim();

                System.out.print("Author: ");
                String author = sc.nextLine().trim();

                myBooks.issueBook(new Book(title, author));
                System.out.println("→ Book issued and added to sorted list!");
            }
            else if (choice == 2) {
                List<Book> borrowed = myBooks.getBorrowedBooks();

                if (borrowed.isEmpty()) {
                    System.out.println("No books borrowed yet.");
                } else {
                    System.out.println("\nYour Borrowed Books (sorted alphabetically):");
                    System.out.println("------------------------------------------------------------");
                    int index = 1;
                    for (Book b : borrowed) {
                        System.out.printf("%2d. %s\n", index++, b);
                    }
                    System.out.println("------------------------------------------------------------");
                    System.out.println("Total books: " + myBooks.getTotalBooks());
                }
            }
            else {
                System.out.println("Invalid choice!");
            }
        }

        System.out.println("\nThank you for using SmartLibrary. Happy Reading! 📚");
        sc.close();
    }
}