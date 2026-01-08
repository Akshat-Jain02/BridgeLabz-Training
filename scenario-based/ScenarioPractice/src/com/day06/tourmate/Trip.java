package com.day06.tourmate;

public abstract class Trip implements IBookable {

    protected String destination;
    protected int duration;

    private Transport transport;
    private Hotel hotel;
    private Activity activity;

    public Trip(String destination, int duration,
                Transport transport, Hotel hotel, Activity activity) {
        this.destination = destination;
        this.duration = duration;
        this.transport = transport;
        this.hotel = hotel;
        this.activity = activity;
    }

    // Encapsulation: internal budget logic hidden
    protected double calculateTotalBudget() {
        return transport.getCost()
                + hotel.getTotalCost()
                + activity.getCost();   // operator +
    }

    public void showTripDetails() {
        System.out.println("Destination: " + destination);
        System.out.println("Duration: " + duration + " days");
        System.out.println("Total Budget: ₹" + calculateTotalBudget());
    }
}
