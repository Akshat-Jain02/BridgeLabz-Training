package com.generics.smartwarehousemanagement;
public class SmartWarehouseSystem {
    
   
    public static void displayAllItems(Storage<? extends WarehouseItem> storage) {
        System.out.println("=== Warehouse Storage Content ===");
        for (int i = 0; i < storage.size(); i++) {
            WarehouseItem item = storage.get(i);
            if (item != null) {
                System.out.println(item);
            }
        }
        System.out.println("Total items: " + storage.size());
        System.out.println("================================");
    }
    
    public static void main(String[] args) {
        // Different typed storages
        Storage<Electronics> electronicsStorage = new Storage<>(5);
        Storage<Groceries> groceryStorage = new Storage<>(8);
        Storage<Furniture> furnitureStorage = new Storage<>(4);
        
        // Adding items
        electronicsStorage.add(new Electronics("E001", "Smart TV", "Samsung"));
        electronicsStorage.add(new Electronics("E002", "Laptop", "Dell"));
        
        groceryStorage.add(new Groceries("G101", "Rice", "Grains"));
        groceryStorage.add(new Groceries("G102", "Milk", "Dairy"));
        groceryStorage.add(new Groceries("G103", "Apples", "Fruits"));
        
        furnitureStorage.add(new Furniture("F201", "Sofa", "Leather"));
        furnitureStorage.add(new Furniture("F202", "Dining Table", "Teak"));
        
        // Display using wildcard method
        System.out.println("Showing Electronics:");
        displayAllItems(electronicsStorage);
        
        System.out.println("Showing Groceries:");
        displayAllItems(groceryStorage);
        
        System.out.println("Showing Furniture:");
        displayAllItems(furnitureStorage);
        
      
    }
}