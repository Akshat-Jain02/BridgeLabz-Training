package com.objectmodeling.levelone;

public class ECommerceDemo {

    public static void main(String[] args) {

        Customer1 c1 = new Customer1("Rohan");

        Product p1 = new Product("Laptop", 60000);
        Product p2 = new Product("Mouse", 500);

        Order order = new Order();
        order.addProduct(p1);
        order.addProduct(p2);

        c1.placeOrder(order);
    }
    
}
