import java.util.Scanner;

//created a CalculatorUsingSwitch class to perfrom basic arithmetic operation
public class CalculatorUsingSwitch {

    public static void main(String[] args) {

        double first, second;
        String op;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        first = sc.nextDouble();

        System.out.print("Enter second number: ");
        second = sc.nextDouble();

        System.out.print("Enter operator: ");
        op = sc.next();

        // Use switch case to perform operation based on operator enter
        switch (op) {
            case "+":
                System.out.println("Result = " + (first + second));
                break;

            case "-":
                System.out.println("Result = " + (first - second));
                break;

            case "*":
                System.out.println("Result = " + (first * second));
                break;

            case "/":
                if (second != 0) {
                    System.out.println("Result = " + (first / second));
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }

        sc.close();
    }
}
