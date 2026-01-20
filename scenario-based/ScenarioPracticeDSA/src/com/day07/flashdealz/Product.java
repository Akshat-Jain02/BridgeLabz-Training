package com.day07.flashdealz;

class Product {
    private String name;
    private double originalPrice;
    private double discountPrice;
    private double discountPercent;

    public Product(String name, double originalPrice, double discountPrice) {
        this.name = name;
        this.originalPrice = originalPrice;
        this.discountPrice = discountPrice;
        this.discountPercent = ((originalPrice - discountPrice) / originalPrice) * 100;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    @Override
    public String toString() {
        return String.format("%-25s | ₹%8.0f → ₹%8.0f | %6.1f%%",
                name, originalPrice, discountPrice, discountPercent);
    }
}