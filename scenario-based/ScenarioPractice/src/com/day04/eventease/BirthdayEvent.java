package com.day04.eventease;

class BirthdayEvent extends Event {

    public BirthdayEvent(int eventId, String eventName, String location,
                         String date, int attendees, double venueCost,
                         double serviceCost, User organizer) {
    	
        super(eventId, eventName, location, date, attendees,
              venueCost, serviceCost, 500, organizer); // birthday discount
    }

    @Override
    public void schedule() {
        System.out.println("Birthday Party scheduled with fun decorations!");
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }
}
