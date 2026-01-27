package com.day02.dealtracker;

public class DealTrackerMain {
    public static void main(String[] args) {
        DealTracker<Deal> tracker = new DealTracker<>();

        String dealsFile = "samplefiles/deals.txt";

        try {
            tracker.loadDeals(dealsFile);
            tracker.showActiveDeals();
            tracker.showDealCodes();

        } catch (InvalidDealException e) {
            System.out.println("Deal validation error: " + e.getMessage());
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
