package com.day03.smartcheckout;

class Item {
    private String name;
    private double price;
    private int stock;

    public Item(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }
    
    public boolean reduceStock() {
        if (stock > 0) {
            stock--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%-12s ₹%-6.2f  %d", name, price, stock);
    }
}