/* Train Reservation Queue 
Simulate a basic ticket booking system.
1. Show menu with switch
2. Allow multiple bookings using while-loop.
3. Stop booking once seats reach zero (break) */

import java.util.Scanner;

public class TrainReservationSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------------WELCOME--------------");

        System.out.print("Enter the total number of seats : ");
        int totalSeats = sc.nextInt();
        int availableSeats = totalSeats, bookedPassenger = 0;

        //Taking user choices and processing it until all seats are booked
        while (true) {
            if (availableSeats <= 0) {
                System.out.println("\n-----------------------------------------");
                System.out.println("All seats are booked! Reservation closed.");
                break;  
            }  

            // Taking user choice 
            System.out.println("\n--- Menu ---");
            System.out.println("1. Book a Ticket");
            System.out.println("2. View Available Seats");
            System.out.println("3. View Booked Passengers");
            System.out.println("4. Cancel Reservation");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            System.out.println("----------------------------------------");

            //Using  switch case to handle user choice
            switch (choice) {
                case 1 -> {
                    availableSeats--;
                    bookedPassenger++;
                    System.out.println("Ticket Booked Successfully" +
                                       "\nAvailable Seats : " + availableSeats +
                                       "\nNo of booked Passengers : " + bookedPassenger);
                    
                }
                
                case 2 -> System.out.println("\nAvailable Seats are : " + availableSeats);

                case 3 -> System.out.println("\nBooked passengers are : " + bookedPassenger);
      
                case 4 -> {
                   if (bookedPassenger <= 0) {
                       System.out.println("No Reservation is done ");
                   } else {
                       System.out.println("Tickey cancelled successfully !");
                       bookedPassenger--;
                       availableSeats++;
                   }
                }

                default -> {
                    System.out.println("Please! Enter a valid choice");
                }
            }
            
        }

        sc.close();        
    }
}