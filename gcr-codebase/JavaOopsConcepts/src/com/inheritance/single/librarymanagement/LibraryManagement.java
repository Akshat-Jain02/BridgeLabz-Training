package com.inheritance.single.librarymanagement;

public class LibraryManagement {
	public static void main(String[] args) {
        // Create a generic book
        Book genericBook = new Book("Introduction to Programming", 2020);

        // Create an Author object (which is also a Book due to inheritance)
        Author authorBook = new Author(
            "Clean Code",
            2008,
            "Robert C. Martin",
            "Robert C. Martin is a renowned software craftsman and author."
        );

        System.out.println("=== Library Management System ===\n");

        System.out.println("Generic Book:");
        genericBook.displayInfo();

        System.out.println("Book with Author Details:");
        authorBook.displayInfo();

        // Demonstrate polymorphism
        System.out.println("Polymorphic View (treating both as Book):");
        Book[] library = {genericBook, authorBook};

        for (Book item : library) {
            item.displayInfo();
        }
    }
}
