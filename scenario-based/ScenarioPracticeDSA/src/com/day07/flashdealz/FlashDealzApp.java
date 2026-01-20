package com.day07.flashdealz;

public class FlashDealzApp {
    public static void main(String[] args) {
        FlashDealz deals = new FlashDealz();

        // Hard-coded products
        deals.addProduct(new Product("WirelessMouse", 1499, 899));
        deals.addProduct(new Product("BluetoothSpeaker", 2999, 1499));
        deals.addProduct(new Product("SmartWatch", 4999, 3499));
        deals.addProduct(new Product("TShirt", 799, 399));
        deals.addProduct(new Product("Headphones", 2499, 1249));
        deals.addProduct(new Product("PowerBank", 1999, 999));
        deals.addProduct(new Product("Backpack", 2499, 1399));

        System.out.println("Sorting products by highest discount first (Quick Sort)...");
        deals.sortByDiscountDescending();

        // Show top 5 deals (or change the number as needed)
        int top = 5;
        // If you want to show all: int top = deals.getProductCount();

        deals.showTopDeals(top);
    }
}