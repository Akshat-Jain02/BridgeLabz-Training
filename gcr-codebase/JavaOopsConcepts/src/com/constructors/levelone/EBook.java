package com.constructors.levelone;

public class EBook extends Books {
	 EBook(String ISBN, String title, String author) {
	        super(ISBN, title, author);
	    }

	    // Main method in subclass
	    public static void main(String[] args) {
	        EBook ebook = new EBook("978-0134685991", "Effective Java", "Joshua Bloch");

	        // Access demonstration
	        System.out.println("ISBN: " + ebook.ISBN);          // public
	        System.out.println("Title: " + ebook.title);        // protected
	        System.out.println("Author: " + ebook.getAuthor()); // private via getter
	    }
}
