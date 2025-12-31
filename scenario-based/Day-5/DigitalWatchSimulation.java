/* Digital Watch Simulation 
Simulate a 24-hour watch:
1. Print hours and minutes in a nested for-loop.
2. Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements  */

public class DigitalWatchSimulation {

    public static void main(String[] args) {

        System.out.println("Digital Watch Simulation (24-hour format)");
        System.out.println("Starting...");

        // Outer loop for hours (0 to 23)
        for (int hour = 0; hour < 24; hour++) {
            // Inner loop for minutes (0 to 59)
            for (int minute = 0; minute < 60; minute++) {
                
                // Simulate power cut: stop the watch at 13:00
                if (hour == 13 && minute == 0) {
                    System.out.println("Power cut! Watch stopped at 13:00");
                    return;  
                }

                // Format the time nicely 
                String formattedTime = String.format("Time = %02d hours :%02d minutes", hour, minute);
                System.out.println(formattedTime);

               
            }
        }

        System.out.println("Watch completed full 24 hours.");
    }
}