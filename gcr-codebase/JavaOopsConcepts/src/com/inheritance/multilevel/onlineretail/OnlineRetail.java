package com.inheritance.multilevel.onlineretail;

public class OnlineRetail {
	public static void main(String[] args) {
        Order order1 = new Order("ORD001", "2025-12-25");
        ShippedOrder order2 = new ShippedOrder("ORD002", "2025-12-26", "TRACK12345");
        DeliveredOrder order3 = new DeliveredOrder("ORD003", "2025-12-20", "TRACK67890", "2025-12-31");

        System.out.println("=== Simple Order Management ===\n");

        order1.showDetails();
        order2.showDetails();
        order3.showDetails();

        // Polymorphism demo
        System.out.println("Quick Status Check:");
        Order[] orders = {order1, order2, order3};
        for (Order o : orders) {
            System.out.println(o.orderId + " → " + o.getStatus());
        }
    }
}
