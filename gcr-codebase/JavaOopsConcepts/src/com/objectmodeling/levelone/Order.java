package com.objectmodeling.levelone;

import java.util.ArrayList;

public class Order {

    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        for (Product p : products) {
            System.out.println(p.name + " - ₹" + p.price);
        }
    }
    
}
