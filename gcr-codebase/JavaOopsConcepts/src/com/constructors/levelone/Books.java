package com.constructors.levelone;

public class Books {
	    public String ISBN;        // public
	    protected String title;    // protected
	    private String author;     // private

	    // Constructor
	    Books(String ISBN, String title, String author) {
	        this.ISBN = ISBN;
	        this.title = title;
	        this.author = author;
	    }

	    // Method 1
	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    // Method 2
	    public String getAuthor() {
	        return author;
	    }
}
