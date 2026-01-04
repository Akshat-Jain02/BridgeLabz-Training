package com.linkedlists.circular.onlineticketreservationsystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class TicketNode {
	
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;  // Stored as formatted string
    TicketNode next;

    TicketNode(int ticketId, String customerName, String movieName, String seatNumber) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.next = null;
    }

    void display() {
        System.out.printf("ID: %4d | Customer: %-15s | Movie: %-20s | Seat: %-5s | Booked: %s%n",
                ticketId, customerName, movieName, seatNumber, bookingTime);
    }
}