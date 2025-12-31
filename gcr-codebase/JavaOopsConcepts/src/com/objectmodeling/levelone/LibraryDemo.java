package com.objectmodeling.levelone;

public class LibraryDemo {

    public static void main(String[] args) {

        Book book1 = new Book("Java Basics", "James Gosling");
        Book book2 = new Book("Clean Code", "Robert Martin");

        Library cityLibrary = new Library("City Library");
        Library collegeLibrary = new Library("College Library");

        cityLibrary.addBook(book1);
        collegeLibrary.addBook(book1);  // Same book in another library
        collegeLibrary.addBook(book2);

        cityLibrary.showBooks();
        collegeLibrary.showBooks();
    }
    
}
