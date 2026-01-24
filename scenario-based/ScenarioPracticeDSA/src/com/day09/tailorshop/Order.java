package com.day09.tailorshop;

import java.time.LocalDate;

public class Order {
    private String orderId;
    private String customerName;
    private LocalDate deadline;

    public Order(String orderId, String customerName, LocalDate deadline) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.deadline = deadline;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return orderId + "  " + customerName + "  " + deadline;
    }
}