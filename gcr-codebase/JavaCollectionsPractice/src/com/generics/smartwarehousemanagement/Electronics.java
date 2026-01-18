package com.generics.smartwarehousemanagement;

class Electronics extends WarehouseItem {
    private String brand;
    
    public Electronics(String id, String name, String brand) {
        super(id, name);
        this.brand = brand;
    }
    
    @Override
    public String toString() {
        return super.toString() + " (Brand: " + brand + ")";
    }
}