package com.linkedlists.circular.onlineticketreservationsystem;

public class TicketReservationSystem {
	
    private TicketNode last;  
    private int ticketCounter = 1001;  

    
    public void bookTicket(String customerName, String movieName, String seatNumber) {
        TicketNode newNode = new TicketNode(ticketCounter++, customerName, movieName, seatNumber);

        if (last == null) {
            // First ticket
            last = newNode;
            last.next = last;  
        } else {
            // Insert after last
            newNode.next = last.next;  
            last.next = newNode;       
            last = newNode;            
        }
        System.out.println("Ticket booked successfully! Ticket ID: " + (ticketCounter - 1));
    }

    // Remove ticket by Ticket ID
    public void cancelTicket(int ticketId) {
        if (last == null) {
            System.out.println("No tickets booked yet.");
            return;
        }

        TicketNode current = last.next;  // Start from first node
        TicketNode prev = last;

        do {
            if (current.ticketId == ticketId) {
                if (current == last && current.next == last) {
                    // Only one node
                    last = null;
                } else if (current == last) {
                    // Removing the last node
                    prev.next = last.next;  // prev becomes new last's previous
                    last = prev;
                } else {
                    // Normal removal
                    prev.next = current.next;
                    if (current == last.next) {
                        // If removing first node, update last.next
                        last.next = current.next;
                    }
                }
                System.out.println("Ticket ID " + ticketId + " cancelled successfully.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != last.next);

        System.out.println("Ticket ID " + ticketId + " not found.");
    }

    // Display all booked tickets
    public void displayAllTickets() {
        if (last == null) {
            System.out.println("No tickets booked.");
            return;
        }

        System.out.println("\n=== Current Booked Tickets ===");
        TicketNode current = last.next;  // Start from first
        int count = 1;
        do {
            System.out.print(count++ + ". ");
            current.display();
            current = current.next;
        } while (current != last.next);
        System.out.println("=================================\n");
    }

    // Search by Customer Name
    public void searchByCustomer(String name) {
        if (last == null) {
            System.out.println("No tickets available.");
            return;
        }

        System.out.println("Tickets for customer: " + name);
        boolean found = false;
        TicketNode current = last.next;
        do {
            if (current.customerName.equalsIgnoreCase(name)) {
                current.display();
                found = true;
            }
            current = current.next;
        } while (current != last.next);

        if (!found) System.out.println("No tickets found for this customer.");
    }

    // Search by Movie Name
    public void searchByMovie(String movie) {
        if (last == null) {
            System.out.println("No tickets available.");
            return;
        }

        System.out.println("Tickets for movie: " + movie);
        boolean found = false;
        TicketNode current = last.next;
        do {
            if (current.movieName.equalsIgnoreCase(movie)) {
                current.display();
                found = true;
            }
            current = current.next;
        } while (current != last.next);

        if (!found) System.out.println("No tickets found for this movie.");
    }

    //Get total number of booked tickets
    public int getTotalTickets() {
        if (last == null) return 0;

        int count = 0;
        TicketNode current = last.next;
        do {
            count++;
            current = current.next;
        } while (current != last.next);
        return count;
    }
}