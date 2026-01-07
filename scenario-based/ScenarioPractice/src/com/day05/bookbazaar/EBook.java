package com.day05.bookbazaar;

class EBook extends Book {
	
    public EBook(String title, String author, double price) {
        super(title, author, price, Integer.MAX_VALUE);
    }

    public double applyDiscount(int quantity) {
        return price * quantity * 0.10;
    }
}