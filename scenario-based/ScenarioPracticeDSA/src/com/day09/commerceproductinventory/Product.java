package com.day09.commerceproductinventory;

class Product {
	
    String sku;
    String name;
    double price;
    int stock;

    public Product(String sku, String name, double price, int stock) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return sku + " | " + name + " | ₹" + String.format("%.2f", price) + " | Stock: " + stock;
    }
}