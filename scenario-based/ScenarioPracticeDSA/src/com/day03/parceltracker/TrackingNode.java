package com.day03.parceltracker;

import java.util.Date;

class TrackingNode {
	
    String status;
    String location;
    String timestamp;
    TrackingNode next;

    public TrackingNode(String status, String location) {
        this.status = status;
        this.location = location;
        this.timestamp = new Date().toString();
        this.next = null;
    }

    @Override
    public String toString() {
        return String.format("%-20s | %-18s | %s",
                timestamp.substring(4, 19),  // nicer date format
                status,
                location != null && !location.isEmpty() ? location : "-");
    }
}