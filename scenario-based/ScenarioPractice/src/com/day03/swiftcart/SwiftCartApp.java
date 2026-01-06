package com.day03.swiftcart;

import java.util.*;

public class SwiftCartApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        // Pre-defined sample products for easy selection
        List<Product> availableProducts = new ArrayList<>();
        availableProducts.add(new PerishableProduct("Milk", 45.0, "Dairy"));
        availableProducts.add(new PerishableProduct("Apple", 120.0, "Fruits"));
        availableProducts.add(new NonPerishableProduct("Rice 5kg", 450.0, "Grains"));
        availableProducts.add(new NonPerishableProduct("Pasta", 80.0, "Grains"));
        availableProducts.add(new PerishableProduct("Yogurt", 30.0, "Dairy"));

        System.out.println("Welcome to SwiftCart – Grocery Shopping App!\n");

        while (true) {
            System.out.println("\nAvailable Products:");
            for (int i = 0; i < availableProducts.size(); i++) {
                Product p = availableProducts.get(i);
                String type = (p instanceof PerishableProduct) ? "(Perishable)" : "(Non-Perishable)";
                System.out.printf("%d. %s %s - ₹%.2f%n", i + 1, p.getName(), type, p.getPrice());
            }

            System.out.println("\nOptions:");
            System.out.println("1. Add item to cart");
            System.out.println("2. View cart & generate bill");
            System.out.println("3. Apply coupon and finalize");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter product number: ");
                int prodNum = sc.nextInt();
                if (prodNum < 1 || prodNum > availableProducts.size()) {
                    System.out.println("Invalid product number!");
                    continue;
                }
                System.out.print("Enter quantity: ");
                int qty = sc.nextInt();
                if (qty <= 0) {
                    System.out.println("Quantity must be positive!");
                    continue;
                }
                Product selected = availableProducts.get(prodNum - 1);
                cart.addItem(selected, qty);
                System.out.println("Added " + qty + " x " + selected.getName() + " to cart.");

            } else if (choice == 2) {
                if (cart.getItems().isEmpty()) {
                    System.out.println("Cart is empty!");
                } else {
                    cart.generateBill();
                }

            } else if (choice == 3) {
                if (cart.getItems().isEmpty()) {
                    System.out.println("Cart is empty! Add items first.");
                    continue;
                }
                cart.generateBill();
                System.out.print("\nEnter coupon discount amount (flat ₹): ");
                double coupon = sc.nextDouble();
                cart.applyDiscount(coupon);

            } else if (choice == 4) {
                System.out.println("Thank you for shopping with SwiftCart!");
                break;
            } else {
                System.out.println("Invalid option!");
            }
        }
        sc.close();
    }
}