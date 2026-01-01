package com.inheritance.multilevel.onlineretail;

public class ShippedOrder extends Order{
	protected String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getStatus() {
        return "Shipped";
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Status: " + getStatus());
        System.out.println("---");
    }
}
