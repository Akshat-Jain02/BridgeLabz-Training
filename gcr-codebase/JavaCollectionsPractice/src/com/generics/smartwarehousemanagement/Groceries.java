package com.generics.smartwarehousemanagement;

class Groceries extends WarehouseItem {
    private String category;
    
    public Groceries(String id, String name, String category) {
        super(id, name);
        this.category = category;
    }
    
    @Override
    public String toString() {
        return super.toString() + " (Category: " + category + ")";
    }
}