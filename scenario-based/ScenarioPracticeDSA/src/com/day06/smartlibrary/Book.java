package com.day06.smartlibrary;

class Book {
    String title;
    String author;   // just for nice display

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // For clean display
    public String toString() {
        return String.format("%-35s  by  %s", title, author);
    }
}