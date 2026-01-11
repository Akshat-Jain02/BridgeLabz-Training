package com.day01.bookshelf;

import java.util.*;

public class BookShelf {
    private HashMap<String, LinkedList<Book>> library;

    public BookShelf() {
        this.library = new HashMap<>();
    }

    // Add a new book to a genre
    public void addBook(String genre, Book book) {
        library.computeIfAbsent(genre.toLowerCase(), k -> new LinkedList<>()).add(book);
        System.out.println("Book added successfully: " + book.getTitle());
    }

    // Borrow a book (search by ISBN across all genres)
    public boolean borrowBook(String isbn) {
        for (LinkedList<Book> books : library.values()) {
            for (Book book : books) {
                if (book.getIsbn().equals(isbn)) {
                    if (book.isAvailable()) {
                        book.borrow();
                        System.out.println("You borrowed: " + book.getTitle());
                        return true;
                    } else {
                        System.out.println("Sorry, '" + book.getTitle() + "' is already borrowed!");
                        return false;
                    }
                }
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found!");
        return false;
    }

    // Return a book
    public boolean returnBook(String isbn) {
        for (LinkedList<Book> books : library.values()) {
            for (Book book : books) {
                if (book.getIsbn().equals(isbn)) {
                    if (!book.isAvailable()) {
                        book.returnBook();
                        System.out.println("Thank you! Returned: " + book.getTitle());
                        return true;
                    } else {
                        System.out.println("This book was not borrowed!");
                        return false;
                    }
                }
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found!");
        return false;
    }

    // Display all books in a specific genre
    public void displayGenre(String genre) {
        String key = genre.toLowerCase();
        LinkedList<Book> books = library.get(key);

        if (books == null || books.isEmpty()) {
            System.out.println("No books found in genre: " + genre);
            return;
        }

        System.out.println("\n===== " + genre.toUpperCase() + " =====");
        int index = 1;
        for (Book book : books) {
            System.out.printf("%d. %s\n", index++, book);
        }
        System.out.println("=========================");
    }

    // Display entire library
    public void displayAll() {
        if (library.isEmpty()) {
            System.out.println("Library is empty!");
            return;
        }

        System.out.println("\n================ LIBRARY CATALOG ================");
        for (Map.Entry<String, LinkedList<Book>> entry : library.entrySet()) {
            System.out.println("\nGenre: " + entry.getKey().toUpperCase());
            int i = 1;
            for (Book b : entry.getValue()) {
                System.out.printf("  %d. %s\n", i++, b);
            }
        }
        System.out.println("===============================================\n");
    }
}