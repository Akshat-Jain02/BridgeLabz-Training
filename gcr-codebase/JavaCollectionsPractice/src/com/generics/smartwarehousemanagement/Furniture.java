package com.generics.smartwarehousemanagement;

class Furniture extends WarehouseItem {
    private String material;
    
    public Furniture(String id, String name, String material) {
        super(id, name);
        this.material = material;
    }
    
    @Override
    public String toString() {
        return super.toString() + " (Material: " + material + ")";
    }
}