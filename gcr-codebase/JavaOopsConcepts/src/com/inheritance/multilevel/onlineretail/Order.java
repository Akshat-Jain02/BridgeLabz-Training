package com.inheritance.multilevel.onlineretail;

public class Order {
	protected String orderId;
    protected String orderDate;  // Using String for simplicity

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return "Placed";
    }

    public void showDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getStatus());
        System.out.println("---");
    }
}
