package com.day06.medistore;

import java.time.LocalDate;

public abstract class Medicine implements ISellable {

    private String name;
    private double price;
    private LocalDate expiryDate;
    private int quantity;

    // Default quantity constructor
    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 10);
    }

    // Full constructor
    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    // Encapsulation: stock change hidden
    protected void reduceStock(int qty) {
        if (qty > quantity) {
            throw new IllegalArgumentException("Not enough stock!");
        }
        quantity -= qty;
    }

    // Sensitive pricing logic
    private double applyDiscount(double total) {
        if (total >= 1000) {
            return total * 0.9; // 10% discount
        }
        return total;
    }

    @Override
    public double sell(int qty) {
        reduceStock(qty);
        double total = price * qty;   // operator *
        return applyDiscount(total);  // operator -
    }

    protected LocalDate getExpiryDate() {
        return expiryDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }
}
