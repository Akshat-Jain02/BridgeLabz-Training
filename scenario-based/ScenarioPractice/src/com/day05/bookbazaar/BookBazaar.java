package com.day05.bookbazaar;

import java.util.Scanner;

public class BookBazaar {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter th user name");
        String userName = sc.nextLine();
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        Order order = new Order(userName);

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Enter the type");
            String type = sc.nextLine();
            System.out.println("Enter the title");
            String title = sc.nextLine();
            System.out.println("Enter the author");
            String author = sc.nextLine();
            System.out.println("Enter the price");
            double price = sc.nextDouble();
            System.out.println("Enter the quantity");
            int quantity = sc.nextInt();

            if (type.equalsIgnoreCase("ebook")) {
                Book b = new EBook(title, author, price);
                order.addBook(b, quantity);
            } else {
            	System.out.println("Enter the stock");
                int stock = sc.nextInt();
                Book b = new PrintedBook(title, author, price, stock);
                order.addBook(b, quantity);
            }
        }

        if (order.processOrder()) {
            System.out.println("Order Confirmed");
            System.out.println(Math.round(order.calculateTotal()));
        } else {
            System.out.println("Order Failed");
        }
    }
}