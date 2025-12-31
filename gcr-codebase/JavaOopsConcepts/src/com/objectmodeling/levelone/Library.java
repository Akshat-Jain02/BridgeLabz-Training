package com.objectmodeling.levelone;

import java.util.ArrayList;

public class Library {

    String libraryName;
    ArrayList<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        System.out.println("\nBooks in " + libraryName + ":");
        for (Book book : books) {
            book.displayBook();
        }
    }
    
}
