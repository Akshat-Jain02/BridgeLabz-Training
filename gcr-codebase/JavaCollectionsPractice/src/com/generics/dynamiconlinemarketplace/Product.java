package com.generics.dynamiconlinemarketplace;

class Product<T> {
    private T item;
    private String id;
    
    public Product(String id, T item) {
        this.id = id;
        this.item = item;
    }
    
    public T getItem() {
        return item;
    }
    
    public String getId() {
        return id;
    }
    
    public double getPrice() {
        if (item instanceof BookProduct) return ((BookProduct)item).price;
        if (item instanceof ClothingProduct) return ((ClothingProduct)item).price;
        if (item instanceof GadgetProduct) return ((GadgetProduct)item).price;
        return 0;
    }
}