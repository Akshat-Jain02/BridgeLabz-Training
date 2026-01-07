package com.day05.bookbazaar;

class Book implements IDiscountable {
	
    protected String title;
    protected String author;
    protected double price;
    private int stock;

    public Book(String title, String author, double price) {
        this(title, author, price, 0);
    }

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public boolean reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            return true;
        }
        return false;
    }

    public int getStock() {
        return stock;
    }

    public double applyDiscount(int quantity) {
        return 0;
    }
}