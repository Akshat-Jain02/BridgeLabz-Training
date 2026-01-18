package com.day06.smartlibrary;

import java.util.ArrayList;
import java.util.List;

class BookList {
    private List<Book> books = new ArrayList<>();

    // Insert new book and keep list sorted (Insertion Sort style)
    void issueBook(Book newBook) {
        // Find the correct position to insert
        int i = 0;
        while (i < books.size() && 
               books.get(i).title.compareToIgnoreCase(newBook.title) < 0) {
            i++;
        }
        
        // Insert at the right place
        books.add(i, newBook);
    }

    // Get all borrowed books (already sorted)
    List<Book> getBorrowedBooks() {
        return new ArrayList<>(books);
    }

    int getTotalBooks() {
        return books.size();
    }
}