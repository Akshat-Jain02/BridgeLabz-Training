package com.day05.bookbazaar;

import java.util.ArrayList;

class Order {
	
    private String userName;
    private boolean confirmed;
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Integer> quantities = new ArrayList<>();

    public Order(String userName) {
        this.userName = userName;
        this.confirmed = false;
    }

    public void addBook(Book book, int quantity) {
        books.add(book);
        quantities.add(quantity);
    }

    protected void confirmOrder() {
        confirmed = true;
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            int q = quantities.get(i);
            double discount = b.applyDiscount(q);
            total += (b.price * q) - discount;
        }
        return total;
    }

    public boolean processOrder() {
        for (int i = 0; i < books.size(); i++) {
            if (!books.get(i).reduceStock(quantities.get(i))) {
                return false;
            }
        }
        confirmOrder();
        return true;
    }
}