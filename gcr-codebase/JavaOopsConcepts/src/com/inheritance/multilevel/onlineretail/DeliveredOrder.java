package com.inheritance.multilevel.onlineretail;

public class DeliveredOrder extends ShippedOrder{
	private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, 
                          String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getStatus() {
        return "Delivered";
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Delivery Date: " + deliveryDate);
        System.out.println("Final Status: " + getStatus());
        System.out.println("---");
    }
}
