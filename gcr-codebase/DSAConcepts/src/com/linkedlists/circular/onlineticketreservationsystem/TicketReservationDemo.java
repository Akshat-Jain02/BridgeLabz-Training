package com.linkedlists.circular.onlineticketreservationsystem;

import java.util.Scanner;

public class TicketReservationDemo {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        TicketReservationSystem system = new TicketReservationSystem();

        System.out.println("=== Online Movie Ticket Reservation System ===");
        System.out.println("Using Circular Linked List for Booking Management\n");

        while (true) {
            System.out.println("1. Book a Ticket");
            System.out.println("2. Cancel a Ticket (by Ticket ID)");
            System.out.println("3. Display All Booked Tickets");
            System.out.println("4. Search by Customer Name");
            System.out.println("5. Search by Movie Name");
            System.out.println("6. Show Total Booked Tickets");
            System.out.println("7. Exit");
            System.out.print("\nChoose an option: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Customer Name: ");
                    String cust = sc.nextLine();
                    System.out.print("Enter Movie Name: ");
                    String movie = sc.nextLine();
                    System.out.print("Enter Seat Number (e.g., A12): ");
                    String seat = sc.nextLine();
                    system.bookTicket(cust, movie, seat);
                    break;

                case 2:
                    System.out.print("Enter Ticket ID to cancel: ");
                    int id = sc.nextInt();
                    system.cancelTicket(id);
                    break;

                case 3:
                    system.displayAllTickets();
                    break;

                case 4:
                    System.out.print("Enter Customer Name: ");
                    String searchCust = sc.nextLine();
                    system.searchByCustomer(searchCust);
                    break;

                case 5:
                    System.out.print("Enter Movie Name: ");
                    String searchMovie = sc.nextLine();
                    system.searchByMovie(searchMovie);
                    break;

                case 6:
                    System.out.println("Total booked tickets: " + system.getTotalTickets());
                    break;

                case 7:
                    System.out.println("Thank you for using the system. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}