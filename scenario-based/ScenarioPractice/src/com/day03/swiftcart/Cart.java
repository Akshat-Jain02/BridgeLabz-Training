package com.day03.swiftcart;

import java.util.*;

class Cart implements ICheckout {
    private List<CartItem> items;
    private double totalPrice; // Encapsulated – updated only inside Cart

    public Cart() {
        this.items = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public Cart(List<CartItem> initialItems) {
        this.items = new ArrayList<>(initialItems);
        calculateTotal();
    }

    public void addItem(Product product, int quantity) {
        items.add(new CartItem(product, quantity));
        calculateTotal();
    }

    public void removeItem(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
            calculateTotal();
        }
    }

    private void calculateTotal() {
        totalPrice = 0.0;
        for (CartItem item : items) {
            totalPrice += item.getSubTotal();
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public List<CartItem> getItems() {
        return Collections.unmodifiableList(items); // Read-only view
    }

    @Override
    public void generateBill() {
        System.out.println("\n=== SwiftCart Bill ===");
        System.out.println("Item\t\tQty\tPrice\tSubtotal");
        System.out.println("-------------------------------------------");
        for (CartItem item : items) {
            Product p = item.getProduct();
            System.out.printf("%-15s %3d x %.2f = %.2f%n",
                    p.getName(), item.getQuantity(), p.getPrice(), item.getSubTotal());
        }
        System.out.println("-------------------------------------------");
        System.out.printf("Total: %.2f%n", totalPrice);
    }

    @Override
    public void applyDiscount(double couponValue) {
        // First apply product-type specific percentage discount
        double percentageDiscount = 0.0;
        for (CartItem item : items) {
            double disc = item.getProduct().getDiscountPercentage();
            percentageDiscount += (item.getSubTotal() * disc / 100.0);
        }

        // Then apply flat coupon discount
        totalPrice = totalPrice - percentageDiscount - couponValue;

        if (totalPrice < 0) totalPrice = 0.0;

        System.out.printf("Applied product discounts: -%.2f%n", percentageDiscount);
        System.out.printf("Applied coupon discount: -%.2f%n", couponValue);
        System.out.printf("Final amount after discounts: %.2f%n", totalPrice);
    }
}