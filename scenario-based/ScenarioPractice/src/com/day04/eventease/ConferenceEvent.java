package com.day04.eventease;

class ConferenceEvent extends Event {

    public ConferenceEvent(int eventId, String eventName, String location,
                            String date, int attendees, double venueCost,
                            double serviceCost, User organizer) {
        super(eventId, eventName, location, date, attendees,
              venueCost, serviceCost, 0, organizer);
    }

    @Override
    public void schedule() {
        System.out.println("Conference scheduled with professional setup.");
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }
}
