package com.day03.smartcheckout;

import java.util.List;

class Customer {
    private String name;
    private List<String> requestedItems;

    public Customer(String name, List<String> items) {
        this.name = name;
        this.requestedItems = items;
    }

    public String getName() {
        return name;
    }

    public List<String> getRequestedItems() {
        return requestedItems;
    }

    @Override
    public String toString() {
        return name + " (" + requestedItems.size() + " items)";
    }
}