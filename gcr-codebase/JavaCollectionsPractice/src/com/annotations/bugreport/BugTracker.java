package com.annotations.bugreport;

public class BugTracker {

    @BugReport(description = "NullPointerException on empty input")
    @BugReport(description = "Performance issue with large data")
    public void processData() {
        System.out.println("Processing data");
    }
}
