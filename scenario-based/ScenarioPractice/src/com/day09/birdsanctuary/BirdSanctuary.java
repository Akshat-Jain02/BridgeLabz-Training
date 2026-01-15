package com.day09.birdsanctuary;

import java.util.*;

class BirdSanctuary {
    private List<Bird> birds = new ArrayList<>();
    private int idCounter = 1;

    public void addBird(String type, String name) {
        String id = "B" + idCounter++;
        Bird bird = null;
        switch (type.toLowerCase()) {
            case "eagle":
                bird = new Eagle(name, id);
                break;
            case "sparrow":
                bird = new Sparrow(name, id);
                break;
            case "duck":
                bird = new Duck(name, id);
                break;
            case "penguin":
                bird = new Penguin(name, id);
                break;
            case "seagull":
                bird = new Seagull(name, id);
                break;
            case "kiwi":
                bird = new Kiwi(name, id);
                break;
            case "ostrich":
                bird = new Ostrich(name, id);
                break;
            default:
                System.out.println("Invalid bird type.");
                return;
        }
        birds.add(bird);
        System.out.println("Added: " + bird);
    }

    public void displayAllBirds() {
        if (birds.isEmpty()) {
            System.out.println("No birds in the sanctuary.");
            return;
        }
        for (Bird bird : birds) {
            System.out.println(bird);
            System.out.print("Abilities: ");
            if (bird instanceof Flyable) System.out.print("Can Fly ");
            if (bird instanceof Swimmable) System.out.print("Can Swim ");
            if (!(bird instanceof Flyable) && !(bird instanceof Swimmable)) System.out.print("Neither ");
            System.out.println();
            bird.eat(); // Polymorphic call
            if (bird instanceof Flyable) ((Flyable) bird).fly(); // Polymorphic
            if (bird instanceof Swimmable) ((Swimmable) bird).swim(); // Polymorphic
            System.out.println();
        }
    }

    public void displayFlyingBirds() {
        boolean found = false;
        for (Bird bird : birds) {
            if (bird instanceof Flyable) {
                System.out.println(bird);
                ((Flyable) bird).fly();
                found = true;
            }
        }
        if (!found) System.out.println("No flying birds.");
    }

    public void displaySwimmingBirds() {
        boolean found = false;
        for (Bird bird : birds) {
            if (bird instanceof Swimmable) {
                System.out.println(bird);
                ((Swimmable) bird).swim();
                found = true;
            }
        }
        if (!found) System.out.println("No swimming birds.");
    }

    public void displayBoth() {
        boolean found = false;
        for (Bird bird : birds) {
            if (bird instanceof Flyable && bird instanceof Swimmable) {
                System.out.println(bird);
                ((Flyable) bird).fly();
                ((Swimmable) bird).swim();
                found = true;
            }
        }
        if (!found) System.out.println("No birds that can both fly and swim.");
    }

    public void removeBirdById(String id) {
        Iterator<Bird> iterator = birds.iterator();
        boolean removed = false;
        while (iterator.hasNext()) {
            Bird bird = iterator.next();
            if (bird.getId().equals(id)) {
                iterator.remove();
                System.out.println("Removed: " + bird);
                removed = true;
                break;
            }
        }
        if (!removed) System.out.println("Bird not found.");
    }

    public void showReport() {
        int flyable = 0, swimmable = 0, both = 0, neither = 0;
        for (Bird bird : birds) {
            boolean canFly = bird instanceof Flyable;
            boolean canSwim = bird instanceof Swimmable;
            if (canFly && canSwim) both++;
            else if (canFly) flyable++;
            else if (canSwim) swimmable++;
            else neither++;
        }
        System.out.println("Flyable: " + flyable);
        System.out.println("Swimmable: " + swimmable);
        System.out.println("Both: " + both);
        System.out.println("Neither: " + neither);
    }
}