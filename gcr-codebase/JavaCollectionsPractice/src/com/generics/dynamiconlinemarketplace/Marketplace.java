package com.generics.dynamiconlinemarketplace;

class Marketplace {
    public static <T> void applyDiscount(T product, double percentage) {
        if (percentage < 0 || percentage > 100) {
            return;
        }
        
        if (product instanceof Product) {
            Product p = (Product) product;
            Object item = p.getItem();
            double discountFactor = 1 - (percentage / 100.0);
            
            if (item instanceof BookProduct) {
                BookProduct bp = (BookProduct) item;
                bp.price = bp.price * discountFactor;
            }
            else if (item instanceof ClothingProduct) {
                ClothingProduct cp = (ClothingProduct) item;
                cp.price = cp.price * discountFactor;
            }
            else if (item instanceof GadgetProduct) {
                GadgetProduct gp = (GadgetProduct) item;
                gp.price = gp.price * discountFactor;
            }
        }
    }
}