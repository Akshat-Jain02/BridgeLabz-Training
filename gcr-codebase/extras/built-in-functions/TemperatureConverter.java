import java.util.Scanner;

public class TemperatureConverter { 

    //Method to convert fahrenheit to celsius
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    //Method to convert celsisus to fahrenheit
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    //Method to get Temperature as input from user
    public static double getTemperature(Scanner sc) {
        System.out.print("Enter temperature value: ");
        return sc.nextDouble();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Choose an option (1 or 2): ");
        int choice = sc.nextInt();

        double temp = getTemperature(sc);
        double result;

        //Displaying the final result
        if (choice == 1) {
            result = fahrenheitToCelsius(temp);
            System.out.println("Temperature in Celsius: " + result);
        } else if (choice == 2) {
            result = celsiusToFahrenheit(temp);
            System.out.println("Temperature in Fahrenheit: " + result);
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
    
}