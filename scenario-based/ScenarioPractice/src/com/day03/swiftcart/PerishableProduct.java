package com.day03.swiftcart;

class PerishableProduct extends Product {
	
    public PerishableProduct(String name, double price, String category) {
        super(name, price, category);
    }

    @Override
    public double getDiscountPercentage() {
        // Perishable items get 10% discount
        return 10.0;
    }
}