package com.day03.swiftcart;

class NonPerishableProduct extends Product {
	
    public NonPerishableProduct(String name, double price, String category) {
        super(name, price, category);
    }

    @Override
    public double getDiscountPercentage() {
        // Non-perishable items get 5% discount
        return 5.0;
    }
}