package com.constructors.levelone;

public class HotelBooking {
	    String guestName;
	    String roomType;
	    int nights;

	    // Default constructor
	    HotelBooking() {
	        guestName = "Guest";
	        roomType = "Standard";
	        nights = 1;
	    }

	    // Parameterized constructor
	    HotelBooking(String guestName, String roomType, int nights) {
	        this.guestName = guestName;
	        this.roomType = roomType;
	        this.nights = nights;
	    }

	    // Copy constructor
	    HotelBooking(HotelBooking hb) {
	        this.guestName = hb.guestName;
	        this.roomType = hb.roomType;
	        this.nights = hb.nights;
	    }

	    // Method to display booking details
	    void displayBooking() {
	        System.out.println("Guest Name: " + guestName);
	        System.out.println("Room Type: " + roomType);
	        System.out.println("Nights: " + nights);
	        System.out.println("--------------------");
	    }

	    // Main method for testing
	    public static void main(String[] args) {

	        // Using default constructor and creating object
	        HotelBooking booking1 = new HotelBooking();

	        // Using parameterized constructor to initialize object
	        HotelBooking booking2 = new HotelBooking("Amit", "Deluxe", 3);

	        // Using copy constructor to copy the state
	        HotelBooking booking3 = new HotelBooking(booking2);

	        //Calling the display method to display the final results
	        booking1.displayBooking();
	        booking2.displayBooking();
	        booking3.displayBooking();
	    }
}
