package com.day03.parceltracker;

class Parcel {
	
    private String parcelId;
    private String sender;
    private String receiver;
    private TrackingNode head;
    private TrackingNode tail;

    public Parcel(String parcelId, String sender, String receiver) {
        this.parcelId = parcelId;
        this.sender = sender;
        this.receiver = receiver;
        this.head = null;
        this.tail = null;
    }

    public void addStatus(String status, String location) {
        TrackingNode newNode = new TrackingNode(status, location);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public String getCurrentStatus() {
        if (tail == null) return "Not yet started";
        return tail.status;
    }

    public boolean isDelivered() {
        return tail != null && tail.status.equalsIgnoreCase("Delivered");
    }

    public void markAsLost() {
        addStatus("Lost / Missing", "Unknown location");
        tail = null; // simulate broken chain
    }

    public void printHistory() {
        System.out.println("\n==================================================================");
        System.out.println("| Parcel ID    : " + parcelId);
        System.out.println("| Sender       : " + sender);
        System.out.println("| Receiver     : " + receiver);
        System.out.println("|===================================================================");
        System.out.println("| Date & Time        | Status               ║ Location            |");
        System.out.println("|===================================================================|");

        TrackingNode current = head;
        if (current == null) {
            System.out.println("|                    | No updates yet       |                    |");
        } else {
            while (current != null) {
                System.out.println("║ " + current);
                current = current.next;
            }
        }
        System.out.println("=====================================================================");
    }
}