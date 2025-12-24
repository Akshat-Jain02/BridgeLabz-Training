import java.util.Scanner;

public class Calculator {
    //Method to add two numbers
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
   
    //Method to subtract two numbers
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    //Method to multiply two number
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    //Method two divide two number
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return num1 / num2;
    }

    // Method to take user input
    public static double getNumber(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextDouble();
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Basic Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose an operation (1-4): ");
        int choice = sc.nextInt();

        double num1 = getNumber(sc, "Enter first number: ");
        double num2 = getNumber(sc, "Enter second number: ");

        double result;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("Result: " + result);
                break;

            case 2:
                result = subtract(num1, num2);
                System.out.println("Result: " + result);
                break;

            case 3:
                result = multiply(num1, num2);
                System.out.println("Result: " + result);
                break;

            case 4:
                result = divide(num1, num2);
                System.out.println("Result: " + result);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }

}