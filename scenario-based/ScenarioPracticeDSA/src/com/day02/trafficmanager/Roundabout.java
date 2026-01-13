package com.day02.trafficmanager;

class Roundabout {
	
    VehicleNode head = null;

    void addCar(String number) {
        VehicleNode newNode = new VehicleNode(number);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        VehicleNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    void removeCar() {
        if (head == null) return;
        if (head.next == head) {
            head = null;
            return;
        }
        VehicleNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = head.next;
        head = head.next;
    }

    void printRoundabout() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        VehicleNode temp = head;
        do {
            System.out.print(temp.number + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}