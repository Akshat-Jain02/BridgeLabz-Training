import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmeticDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take date input from user as an input
        System.out.print("Enter a date (yyyy-mm-dd): ");
        String inputDate = sc.nextLine();

        // Convert input string to LocalDate
        LocalDate date = LocalDate.parse(inputDate);

        //Add 7 days, 1 month, and 2 years
        LocalDate modifiedDate = date
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2);

        // Subtract 3 weeks to get the modified date
        modifiedDate = modifiedDate.minusWeeks(3);

        // Display the final results
        System.out.println("Original Date: " + date);
        System.out.println("Final Date after calculations: " + modifiedDate);

        sc.close();
    }
}
