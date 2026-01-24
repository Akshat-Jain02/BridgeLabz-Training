package com.day09.tailorshop;

public class OrderList {
    private Order[] orders;
    private int size;
    private final int capacity;

    public OrderList(int capacity) {
        this.capacity = capacity;
        this.orders = new Order[capacity];
        this.size = 0;
    }

    public boolean add(Order newOrder) {
        if (size >= capacity) {
            return false;
        }

        int i = size - 1;
        while (i >= 0 && orders[i].getDeadline().isAfter(newOrder.getDeadline())) {
            orders[i + 1] = orders[i];
            i--;
        }

        orders[i + 1] = newOrder;
        size++;
        return true;
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(orders[i]);
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public Order get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return orders[index];
    }
}