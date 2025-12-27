package com.constructors.levelone;

public class Book {
	 // Attributes
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "The song of ice and fire";
        author = "George R Martin";
        price = 1500;
    }

    // Parameterized constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // Method to display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Using default constructor and a object creation
        Book b1 = new Book();
        b1.display();

        System.out.println();

        // Using parameterized constructor
        Book b2 = new Book("Java Programming", "James Gosling", 499.50);
        b2.display();
    }
}
