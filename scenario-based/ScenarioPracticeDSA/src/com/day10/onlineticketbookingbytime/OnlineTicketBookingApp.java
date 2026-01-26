package com.day10.onlineticketbookingbytime;

import java.time.LocalDateTime;

public class OnlineTicketBookingApp {
    public static void main(String[] args) {
        EventSchedulerAVL scheduler = new EventSchedulerAVL();

        scheduler.addEvent(1, "Concert",
                LocalDateTime.of(2026, 2, 10, 18, 30));

        scheduler.addEvent(2, "Movie",
                LocalDateTime.of(2026, 1, 25, 21, 0));

        scheduler.addEvent(3, "Conference",
                LocalDateTime.of(2026, 3, 5, 9, 0));

        scheduler.addEvent(4, "Workshop",
                LocalDateTime.of(2026, 1, 20, 10, 0));

        scheduler.cancelEvent(2);

        for (Event e : scheduler.showUpcomingEvents())
            System.out.println(e);
    }
}
