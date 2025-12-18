import java.util.Scanner;

// Created a QuotientAndRemainder class to calculate quotient and remainder

public class QuotientAndRemainder {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number : ");
        int number1 = sc.nextInt();

        System.out.println("Enter the second number : ");
        int number2 = sc.nextInt();
        
        //Calculating quotient by dividing number1 by number2
        int quotient = number1 / number2;
        //Calculating number by modulus operation
        int remainder = number1 % number2;
        
        //Printing the quotient and remainder
        System.out.println("The Quotient is " + quotient + " and remainder is " + remainder +
                           " of two number " + number1 +" and " + number2 );
     
    }
}