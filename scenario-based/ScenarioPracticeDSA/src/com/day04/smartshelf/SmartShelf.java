package com.day04.smartshelf;

import java.util.Scanner;

class SmartShelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookShelf shelf = new BookShelf();
        
        System.out.println("=== SmartShelf - Real-Time Book Arrangement ===");
        System.out.println("Add books one by one (type 'done' to finish)\n");
        
        while (true) {
            System.out.print("Enter book title: ");
            String title = sc.nextLine().trim();
            
            if (title.equalsIgnoreCase("done")) {
                break;
            }
            
            if (title.isEmpty()) {
                System.out.println("Please enter a valid title!\n");
                continue;
            }
            
            shelf.addBook(title);
            shelf.displayBooks();
        }
        
        shelf.displayFinalList();
        
        System.out.println("\nHappy reading, Akshat! 📚");
        sc.close();
    }
}
