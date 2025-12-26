import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {

        // Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Taking height input (in meters)
        System.out.print("Enter height in meters: ");
        double heightInMeters = scanner.nextDouble();

        // Taking weight input (in kilograms)
        System.out.print("Enter weight in kilograms: ");
        double weightInKg = scanner.nextDouble();

        // Calculating BMI using the formula
        double bmi = weightInKg / (heightInMeters * heightInMeters);

        // Displaying BMI value
        System.out.println("Your BMI is: " + bmi);

        // Determining BMI category using if-else
        if (bmi < 18.5) {
            System.out.println("BMI Category: Underweight");
        } 
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("BMI Category: Normal");
        } 
        else {
            System.out.println("BMI Category: Overweight");
        }

        // Closing the scanner
        scanner.close();
    }
}
