/* Movie Ticket Booking App 
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names. */

import java.util.Scanner;

public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-------------WELCOME--------------");
        //Displaying choice to the user
        System.out.println("\nEnter your choice");
        System.out.println("1/ Comedy");
        System.out.println("2/ Horror");
        System.out.println("3/ Action");
        
        //taking choice of user as input
        int choice = sc.nextInt(), amount = 0;
        System.out.println("--------------------------------------");
        System.out.println("Want gold seat ? (y/n)");
        char g = sc.next().toLowerCase().charAt(0);
        System.out.println("Do you want snacks ? (y/n)");
        char s = sc.next().toLowerCase().charAt(0);
 
        if (s == 'y') {
            amount += 500;
        }
        
        //Using switch case to calculate final ticket price
        switch (choice) {
         
            case 1 -> {
                if (g != 'n') {
                    amount += 5000;
                } else {
                    amount += 2000;
                }
            } 

            case 2 -> {
                if (g != 'n') {
                    amount += 5000;
                } else {
                    amount += 2000;
                }
            } 

            case 3 -> {
                if (g != 'n') {
                    amount += 5000;
                } else {
                    amount += 2000;
                }
            } 

           case 4 -> {
                if (g != 'n') {
                    amount += 5000;
                } else {
                    amount += 2000;
                }
            } 

           default -> {
               System.out.println("Please enter a valid choice");
           }
        }

        //Printing the final Price
        System.out.println("\n--------------------BILL------------------" + 
                           "\nPRICE : " + amount);
        

        sc.close();
    }
}