/* Rohan’s Library Reminder App 
Rohan wants a fine calculator:
1. Input return date and due date.
2. If returned late, calculate fine: ₹5/day.
3. Repeat for 5 books using for-loop. */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class RohansLibraryFineCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalFine = 0;

        System.out.println("========================================");
        System.out.println("   Rohan's Library Fine Calculator ");
        System.out.println("   Fine: 5 Rupee per day for late return");
        System.out.println("========================================");
        System.out.println();

        // For-loop to process exactly 5 books
        for (int i = 1; i <= 5; i++) {
            System.out.println("--- Book " + i + " ---");

            // Input due date from user
            LocalDate dueDate = getDateFromUser(sc, "Enter due date (YYYY-MM-DD): ");

            // Input return date from user
            LocalDate returnDate = getDateFromUser(sc, "Enter return date (YYYY-MM-DD): ");

            // Calculate days late to return a book
            long daysLate = ChronoUnit.DAYS.between(dueDate, returnDate);

            if (daysLate > 0) {
                int fine = (int) daysLate * 5;
                System.out.println("Returned " + daysLate + " day(s) late.");
                System.out.println("Fine for this book: " + fine + " Rupee");
                totalFine += fine;
            } else {
                System.out.println("Returned on time. No fine.");
            }
            System.out.println();
        }

        // Final summary
        System.out.println("=== Summary ===");
        System.out.println("Total fine for 5 books: " + totalFine + " Rupees");

        sc.close();
    }

    // Helper method to get and validate date input
    private static LocalDate getDateFromUser(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                String input = scanner.nextLine();
                return LocalDate.parse(input);  // Expects YYYY-MM-DD format
            } catch (Exception e) {
                System.out.println("Invalid date format! Please enter in YYYY-MM-DD format.\n");
            }
        }
    }
}