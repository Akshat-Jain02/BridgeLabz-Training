/* 6. Parking Lot Gate System 
Develop a smart parking system.
1. Options: Park, Exit, Show Occupancy
2. Use switch-case for the menu.
3. while loop to continue until the parking lot is full or the user exits. */

import java.util.Scanner;

public class ParkingLotGateSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //totalSpace variable to store the total car a parking lot can house
        System.out.println("Enter the total available space");
        int totalSpace = sc.nextInt();

        //currentlyOccupied variable to keep track of the currently occupied space
        int currentlyOccupied = 0;

        Boolean exitSystem = false;
        while (!exitSystem) {
            System.out.println("Select Choice : Park/ Exit/ Show-Occupancy/ close");
            String choice = sc.next().toLowerCase();

            //using switch to perform operation based on user choice
            switch(choice) {
                case "park" : 
                    if (currentlyOccupied >= totalSpace) {
                        System.out.println("Sorry : The Praking lot is full");
                    } else {
                        currentlyOccupied++;
                        System.out.println("The Car is parked successfully");
                    }

                    break;
                case "show-occupancy" :
                    if (currentlyOccupied == 0) {
                        System.out.println("The Parking lot is empty");
                    } else {
                        System.out.println("The Current occupancy is : " + currentlyOccupied +
                                           "\n The Maximum occupancy is : " + totalSpace);
                    }

                    break;

                case "exit" : 
                    if (currentlyOccupied == 0) {
                        System.out.println("No car is parked");
                    } else {
                       currentlyOccupied--;
                       System.out.println("Exiting the parking lot ");
                    } 
                    break;

                case "close" :
                     System.out.println("Exiting smart parking system");
                     exitSystem = true;
                     break;
                default :

                    System.out.println("Please enter a valid input");
               
            }
        }

        sc.close();
    }
}