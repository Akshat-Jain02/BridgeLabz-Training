import java.util.Scanner;

//Create a caculator class for basic arithmetic operation
public class Calculator {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        
        //Taking two numbers as input
        System.out.println("Enter the first number :");
        double number1 = sc.nextDouble();
        System.out.println("Enter the second number :");
        double number2 = sc.nextDouble();
        
        //performing arithmetic operation
        double addition = number1 + number2;
        double subtraction = Math.abs(number1 - number2);
        double multiplication = number1 * number2;
        double division = number1 / number2;
        
        //Displaying the output of the arithmetic operation
        System.out.println("The addition, subtraction, multiplication and division value of 2 number " +
                           number1 + " and " + number2 + " is " +addition+" ," +subtraction + " ," +
                           multiplication+ " and " + division );       
    }
}