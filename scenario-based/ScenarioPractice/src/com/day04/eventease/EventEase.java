package com.day04.eventease;

public class EventEase {

    public static void main(String[] args) {

        User organizer = new User("Akshat", "akshat@gmail.com");

        Event birthday = new BirthdayEvent(
                101, "Akshat's Birthday", "Banquet Hall",
                "20-Apr-2026", 50, 20000, 8000, organizer
        );

        Event conference = new ConferenceEvent(
                201, "Tech Conference", "Convention Center",
                "10-May-2026", 300, 50000, 20000, organizer
        );

        birthday.schedule();
        conference.schedule();

        conference.reschedule("12-May-2026");
        birthday.cancel();
    }
}
