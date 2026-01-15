package com.day03.smartcheckout;

import java.util.*;

class CheckoutCounter {
    private Queue<Customer> queue;
    private Map<String, Item> inventory;

    public CheckoutCounter() {
        this.queue = new LinkedList<>();
        this.inventory = new HashMap<>();
    }

    public void initializeInventory() {
        addItem("Milk", 68.0, 25);
        addItem("Bread", 45.0, 40);
        addItem("Eggs (pack)", 6.5, 120);
        addItem("Rice (1kg)", 52.0, 15);
        addItem("Sugar (1kg)", 48.0, 20);
        addItem("Maggi", 14.0, 60);
        addItem("Butter", 98.0, 18);
        addItem("Tomato", 35.0, 45);
        
        System.out.println("Supermarket inventory initialized!");
    }

    private void addItem(String name, double price, int stock) {
        inventory.put(name.toLowerCase(), new Item(name, price, stock));
    }

    public Item getItem(String name) {
        return inventory.get(name.toLowerCase());
    }

    public void addCustomer(Customer customer) {
        queue.add(customer);
        System.out.println("→ " + customer + " added to queue");
    }

    public void processNextCustomer() {
        if (queue.isEmpty()) {
            System.out.println("No customers in queue!");
            return;
        }

        Customer customer = queue.poll();
        System.out.println("\n=== Processing: " + customer.getName() + " ===");
        System.out.println("------------------------------------------");

        double total = 0;
        int successfulItems = 0;
        int failedItems = 0;

        for (String itemName : customer.getRequestedItems()) {
            Item item = getItem(itemName);
            if (item == null) {
                System.out.println("✗ Item not found: " + itemName);
                failedItems++;
                continue;
            }

            if (item.reduceStock()) {
                total += item.getPrice();
                System.out.printf("  %-15s ₹%.2f   (Stock left: %d)\n", 
                                 item.getName(), item.getPrice(), item.getStock());
                successfulItems++;
            } else {
                System.out.println("✗ Out of stock: " + item.getName());
                failedItems++;
            }
        }

        System.out.println("------------------------------------------");
        System.out.printf("TOTAL: ₹%.2f\n", total);
        System.out.printf("Items purchased: %d   |   Failed: %d\n", 
                         successfulItems, failedItems);
        System.out.println("Thank you! Come again! ✓");
    }

    public void showQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is currently empty.");
            return;
        }

        System.out.println("\nCurrent Queue:");
        int position = 1;
        for (Customer c : queue) {
            System.out.println(position + ". " + c);
            position++;
        }
    }

    public void showInventory() {
        System.out.println("\nCurrent Inventory:");
        System.out.println("Item              Price     Stock");
        System.out.println("-----------------------------------");
        
        List<String> sortedKeys = new ArrayList<>(inventory.keySet());
        Collections.sort(sortedKeys);
        
        for (String key : sortedKeys) {
            System.out.println(inventory.get(key));
        }
    }
}