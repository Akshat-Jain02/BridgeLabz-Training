package com.day06.tourmate;

import java.util.Scanner;

public class TourMate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Trip Type (1-Domestic, 2-International): ");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter Trip Duration (days): ");
        int duration = sc.nextInt();

        System.out.print("Enter Transport Cost: ");
        double transportCost = sc.nextDouble();

        System.out.print("Enter Hotel Cost per Night: ");
        double hotelCost = sc.nextDouble();

        System.out.print("Enter Number of Nights: ");
        int nights = sc.nextInt();

        System.out.print("Enter Activity Cost: ");
        double activityCost = sc.nextDouble();

        Transport transport = new Transport(transportCost);
        Hotel hotel = new Hotel(hotelCost, nights);
        Activity activity = new Activity(activityCost);

        Trip trip;

        if (type == 1) {
            trip = new DomesticTrip(destination, duration, transport, hotel, activity);
        } else {
            trip = new InternationalTrip(destination, duration, transport, hotel, activity);
        }

        System.out.println("\n--- Trip Summary ---");
        trip.showTripDetails();

        System.out.println("\n1. Book Trip\n2. Cancel Trip");
        int choice = sc.nextInt();

        if (choice == 1) {
            trip.book();    // polymorphism
        } else {
            trip.cancel();  // polymorphism
        }

        sc.close();
    }
}
