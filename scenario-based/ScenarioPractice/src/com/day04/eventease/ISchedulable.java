package com.day04.eventease;

interface ISchedulable {
	
    void schedule();
    void reschedule(String newDate);
    void cancel();
}
