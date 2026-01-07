package com.day04.eventease;

class Event implements ISchedulable {

    private final int eventId;     // cannot be modified once assigned
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    private double venueCost;
    private double serviceCost;
    private double discount;

    protected User organizer;

    // Constructor without services
    public Event(int eventId, String eventName, String location, String date,
                 int attendees, double venueCost, User organizer) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = venueCost;
        this.serviceCost = 0;
        this.discount = 0;
        this.organizer = organizer;
    }

    // Constructor with catering & decoration services
    public Event(int eventId, String eventName, String location, String date,
                 int attendees, double venueCost, double serviceCost,
                 double discount, User organizer) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = venueCost;
        this.serviceCost = serviceCost;
        this.discount = discount;
        this.organizer = organizer;
    }

    protected double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    @Override
    public void schedule() {
        System.out.println("Event scheduled on " + date);
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Event cancelled");
    }
}
