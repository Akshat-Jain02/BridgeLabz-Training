package com.generics.smartwarehousemanagement;

class Storage<T extends WarehouseItem> {
    private T[] items;
    private int count;
    
    @SuppressWarnings("unchecked")
    public Storage(int capacity) {
        this.items = (T[]) new WarehouseItem[capacity];
        this.count = 0;
    }
    
    public void add(T item) {
        if (count < items.length) {
            items[count++] = item;
        } else {
            System.out.println("Storage full! Cannot add: " + item);
        }
    }
    
    public T get(int index) {
        if (index >= 0 && index < count) {
            return items[index];
        }
        return null;
    }
    
    public int size() {
        return count;
    }
}