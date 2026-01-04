package com.linkedlists.singly.inventorymanagementsystem;

class InventoryLinkedList {
	
    ItemNode head;

    // Add at beginning
    void addAtBeginning(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    void addAtEnd(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);

        if (head == null) {
            head = newNode;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    // Add at position
    void addAtPosition(int pos, int id, String name, int qty, double price) {
        if (pos == 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }

        ItemNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Invalid position!");
            return;
        }

        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove by Item ID
    void removeById(int id) {
        if (head == null) {
            System.out.println("Inventory is empty!");
            return;
        }

        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item removed.");
            return;
        }

        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id)
            temp = temp.next;

        if (temp.next == null)
            System.out.println("Item not found!");
        else {
            temp.next = temp.next.next;
            System.out.println("Item removed.");
        }
    }

    // Update quantity
    void updateQuantity(int id, int newQty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated successfully!");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found!");
    }

    // Search by ID
    void searchById(int id) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found!");
    }

    // Search by Name
    void searchByName(String name) {
        ItemNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("Item not found!");
    }

    // Calculate total inventory value
    void totalInventoryValue() {
        double total = 0;
        ItemNode temp = head;

        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value: ₹" + total);
    }

    // Display all items
    void displayAll() {
        if (head == null) {
            System.out.println("No items in inventory.");
            return;
        }

        ItemNode temp = head;
        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }

    // Helper
    void displayItem(ItemNode i) {
        System.out.println(
            "ID: " + i.itemId +
            ", Name: " + i.itemName +
            ", Qty: " + i.quantity +
            ", Price: ₹" + i.price
        );
    }

    // ===== SORTING (MERGE SORT) =====

    void sortByName(boolean ascending) {
        head = mergeSort(head, "name", ascending);
    }

    void sortByPrice(boolean ascending) {
        head = mergeSort(head, "price", ascending);
    }

    ItemNode mergeSort(ItemNode h, String key, boolean asc) {
        if (h == null || h.next == null)
            return h;

        ItemNode mid = getMiddle(h);
        ItemNode nextOfMid = mid.next;
        mid.next = null;

        ItemNode left = mergeSort(h, key, asc);
        ItemNode right = mergeSort(nextOfMid, key, asc);

        return sortedMerge(left, right, key, asc);
    }

    ItemNode sortedMerge(ItemNode a, ItemNode b, String key, boolean asc) {
        if (a == null) return b;
        if (b == null) return a;

        boolean condition;
        if (key.equals("name")) {
            condition = asc
                ? a.itemName.compareToIgnoreCase(b.itemName) <= 0
                : a.itemName.compareToIgnoreCase(b.itemName) > 0;
        } else {
            condition = asc ? a.price <= b.price : a.price > b.price;
        }

        ItemNode result;
        if (condition) {
            result = a;
            result.next = sortedMerge(a.next, b, key, asc);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next, key, asc);
        }
        return result;
    }

    ItemNode getMiddle(ItemNode h) {
        if (h == null) return h;

        ItemNode slow = h, fast = h.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}