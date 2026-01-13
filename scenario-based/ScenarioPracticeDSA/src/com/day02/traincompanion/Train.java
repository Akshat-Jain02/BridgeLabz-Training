package com.day02.traincompanion;

class Train {
    private Compartment head;
    private Compartment tail;
    private int compartmentCount;

    public Train() {
        head = null;
        tail = null;
        compartmentCount = 0;
    }

    public void addCompartmentAtEnd(String name, boolean hasWiFi, boolean hasPantry) {
        Compartment newComp = new Compartment(name, hasWiFi, hasPantry);
        
        if (head == null) {
            head = tail = newComp;
        } else {
            tail.next = newComp;
            newComp.prev = tail;
            tail = newComp;
        }
        compartmentCount++;
        System.out.println("Added: " + newComp);
    }

    public void insertAfter(String afterName, String newName, boolean hasWiFi, boolean hasPantry) {
        Compartment current = head;
        while (current != null) {
            if (current.name.equalsIgnoreCase(afterName)) {
                Compartment newComp = new Compartment(newName, hasWiFi, hasPantry);
                
                newComp.next = current.next;
                newComp.prev = current;
                
                if (current.next != null) {
                    current.next.prev = newComp;
                } else {
                    tail = newComp;
                }
                current.next = newComp;
                
                compartmentCount++;
                System.out.println("Inserted " + newComp + " after " + current);
                return;
            }
            current = current.next;
        }
        System.out.println("Compartment '" + afterName + "' not found!");
    }

    public void removeCompartment(String name) {
        Compartment current = head;
        
        while (current != null) {
            if (current.name.equalsIgnoreCase(name)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                
                compartmentCount--;
                System.out.println("Removed: " + current);
                return;
            }
            current = current.next;
        }
        System.out.println("Compartment '" + name + "' not found!");
    }

    public void showCurrentAndNeighbors(String currentName) {
        Compartment current = findCompartment(currentName);
        if (current == null) {
            System.out.println("Compartment '" + currentName + "' not found!");
            return;
        }

        System.out.println("\nYou are in: " + current);
        System.out.println("Previous: " + (current.prev != null ? current.prev : "Engine / None"));
        System.out.println("Next:     " + (current.next != null ? current.next : "Guard / End"));
    }

    public void findNearestService(String service) {
        if (head == null) {
            System.out.println("Train is empty!");
            return;
        }

        Compartment current = head;
        int position = 1;
        Compartment nearest = null;
        int minDistance = Integer.MAX_VALUE;

        while (current != null) {
            boolean match = false;
            if (service.equalsIgnoreCase("pantry") && current.hasPantry) {
                match = true;
            } else if (service.equalsIgnoreCase("wifi") && current.hasWiFi) {
                match = true;
            }

            if (match) {
                System.out.println("Found " + service + " at: " + current + " (position " + position + ")");
                return;
            }
            current = current.next;
            position++;
        }
        System.out.println("No " + service + " found in the train!");
    }

    public void displayTrainForward() {
        if (head == null) {
            System.out.println("Train has no compartments yet!");
            return;
        }

        System.out.println("\nTRAIN (Engine → Guard)");
        Compartment current = head;
        while (current != null) {
            System.out.print(current + (current.next != null ? " → " : ""));
            current = current.next;
        }
        System.out.println("\nTotal compartments: " + compartmentCount);
    }

    private Compartment findCompartment(String name) {
        Compartment current = head;
        while (current != null) {
            if (current.name.equalsIgnoreCase(name)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
}