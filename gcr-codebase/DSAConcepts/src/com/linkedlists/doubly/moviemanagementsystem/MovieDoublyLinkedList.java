package com.linkedlists.doubly.moviemanagementsystem;

class MovieDoublyLinkedList {
	
    MovieNode head;
    MovieNode tail;

    // Add at beginning
    void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add at end
    void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Add at specific position
    void addAtPosition(int pos, String title, String director, int year, double rating) {
        if (pos == 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        MovieNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
            return;
        }

        MovieNode newNode = new MovieNode(title, director, year, rating);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // Remove by movie title
    void removeByTitle(String title) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        MovieNode temp = head;

        while (temp != null && !temp.title.equalsIgnoreCase(title)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Movie not found!");
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

        System.out.println("Movie removed successfully!");
    }

    // Search by director
    void searchByDirector(String director) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No movies found for this director.");
    }

    // Search by rating
    void searchByRating(double rating) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating == rating) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No movies found with this rating.");
    }

    // Update rating by title
    void updateRating(String title, double newRating) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated successfully!");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Movie not found!");
    }

    // Display forward
    void displayForward() {
        if (head == null) {
            System.out.println("No movie records available.");
            return;
        }

        MovieNode temp = head;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    // Display reverse
    void displayReverse() {
        if (tail == null) {
            System.out.println("No movie records available.");
            return;
        }

        MovieNode temp = tail;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }

    // Helper method
    void displayMovie(MovieNode m) {
        System.out.println(
            "Title: " + m.title +
            ", Director: " + m.director +
            ", Year: " + m.year +
            ", Rating: " + m.rating
        );
    }
}