/* Bus Route Distance Tracker 
Each stop adds distance.
1. Ask if the passenger wants to get off at a stop.
2. Use a while-loop with a total distance tracker.
3. Exit on user confirmation. */

import java.util.Scanner;

public class BusRouteDistanceTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Bus Route Distance Tracker!");
        System.out.println("The bus will stop at various points, adding distance along the way.\n");

        double totalDistance = 0.0;
        int stopNumber = 1;
        double distanceBetweenStops = 5.0; // km between each stop

        while (true) {
            // Add distance when reaching the next stop
            totalDistance += distanceBetweenStops;

            System.out.printf("Stop %d reached!%n", stopNumber);
            System.out.printf("Total distance traveled so far: %.1f km%n%n", totalDistance);

            // Ask if passenger wants to get off
            System.out.print("Do you want to get off at this stop? (yes/no): ");
            String response = sc.nextLine().trim().toLowerCase();

            if (response.equals("yes") || response.equals("y")) {
                System.out.println("\nThank you for riding with us!");
                System.out.printf("You got off at Stop %d.%n", stopNumber);
                System.out.printf("Final total distance traveled: %.1f km%n", totalDistance);
                System.out.println("Have a great day! ");
                break;
            } else {
                System.out.println("Continuing the journey...\n");
                stopNumber++;
            }
        }

        sc.close();
    }
}