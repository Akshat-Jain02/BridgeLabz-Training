package com.day04.smartshelf;

class BookShelf {
	
    private String[] books;
    private int size;
    private final int MAX_CAPACITY = 100;
    
    public BookShelf() {
        books = new String[MAX_CAPACITY];
        size = 0;
    }
    
    public void addBook(String title) {
        if (size >= MAX_CAPACITY) {
            System.out.println("Shelf is full!");
            return;
        }
        
        // Use the sorter to insert in sorted position
        InsertionSorter.insertSorted(books, size, title);
        size++;
    }
    
    public void displayBooks() {
        if (size == 0) {
            System.out.println("Your reading list is empty.");
            return;
        }
        
        System.out.println("\nCurrent sorted reading list:");
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
        System.out.println();
    }
    
    public void displayFinalList() {
        System.out.println("\nFinal sorted reading list:");
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }
    
    public int getSize() {
        return size;
    }
}