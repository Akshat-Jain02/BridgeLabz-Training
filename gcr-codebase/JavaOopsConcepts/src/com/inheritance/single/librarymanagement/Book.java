package com.inheritance.single.librarymanagement;

public class Book {
	protected String title;
    protected int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Type: Generic Book");
        System.out.println("------------------------");
    }
}
