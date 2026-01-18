package com.generics.smartwarehousemanagement;

abstract class WarehouseItem {
    private String id;
    private String name;
    
    public WarehouseItem(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String getId() { return id; }
    public String getName() { return name; }
    
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [" + id + "] " + name;
    }
}