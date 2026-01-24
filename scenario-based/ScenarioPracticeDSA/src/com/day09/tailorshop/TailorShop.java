package com.day09.tailorshop;

import java.time.LocalDate;

public class TailorShop {
    public static void main(String[] args) {
        OrderList shop = new OrderList(20);

        System.out.println("New orders arriving one by one:\n");

        shop.add(new Order("O-104", "Priya",    LocalDate.of(2025, 10, 28)));
        shop.printAll();

        shop.add(new Order("O-107", "Aman",     LocalDate.of(2025, 11, 5)));
        shop.printAll();

        shop.add(new Order("O-101", "Rohan",    LocalDate.of(2025, 10, 20)));
        shop.printAll();

        shop.add(new Order("O-112", "Sneha",    LocalDate.of(2025, 11, 12)));
        shop.printAll();

        shop.add(new Order("O-105", "Kavya",    LocalDate.of(2025, 10, 30)));
        shop.printAll();

        shop.add(new Order("O-103", "Arjun",    LocalDate.of(2025, 10, 18)));
        shop.printAll();

        System.out.println("Final sorted list of pending orders:");
        shop.printAll();
    }
}