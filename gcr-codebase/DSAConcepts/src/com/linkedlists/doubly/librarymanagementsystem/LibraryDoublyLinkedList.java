package com.linkedlists.doubly.librarymanagementsystem;

class LibraryDoublyLinkedList {
	
    BookNode head;
    BookNode tail;

    // Add at beginning
    void addAtBeginning(String title, String author, String genre, int id, boolean status) {
        BookNode newNode = new BookNode(title, author, genre, id, status);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add at end
    void addAtEnd(String title, String author, String genre, int id, boolean status) {
        BookNode newNode = new BookNode(title, author, genre, id, status);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Add at specific position
    void addAtPosition(int pos, String title, String author, String genre, int id, boolean status) {
        if (pos == 1) {
            addAtBeginning(title, author, genre, id, status);
            return;
        }

        BookNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null || temp.next == null) {
            addAtEnd(title, author, genre, id, status);
            return;
        }

        BookNode newNode = new BookNode(title, author, genre, id, status);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // Remove by Book ID
    void removeById(int id) {
        if (head == null) {
            System.out.println("Library is empty!");
            return;
        }

        BookNode temp = head;

        while (temp != null && temp.bookId != id)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Book not found!");
            return;
        }

        if (temp == head) {
            head = head.next;
            if (head != null)
                head.prev = null;
        } else if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        System.out.println("Book removed successfully!");
    }

    // Search by title
    void searchByTitle(String title) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No book found with this title.");
    }

    // Search by author
    void searchByAuthor(String author) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No books found by this author.");
    }

    // Update availability
    void updateAvailability(int id, boolean status) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                temp.isAvailable = status;
                System.out.println("Availability status updated!");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found!");
    }

    // Display forward
    void displayForward() {
        if (head == null) {
            System.out.println("No books available.");
            return;
        }

        BookNode temp = head;
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    // Display reverse
    void displayReverse() {
        if (tail == null) {
            System.out.println("No books available.");
            return;
        }

        BookNode temp = tail;
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    // Count books
    int countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Helper method
    void displayBook(BookNode b) {
        System.out.println(
            "ID: " + b.bookId +
            ", Title: " + b.title +
            ", Author: " + b.author +
            ", Genre: " + b.genre +
            ", Available: " + (b.isAvailable ? "Yes" : "No")
        );
    }
}