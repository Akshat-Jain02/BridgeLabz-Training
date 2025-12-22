import java.util.Scanner;

public class NumberCheckerFive {
 
    //Method to find sum of proper divisors
    public static int sumOfProperDivisors(int number) {
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
   
    // Method to check the number is perfect or not
    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }
        return sumOfProperDivisors(number) == number;
    }
 
    //Method to check the number is adundant or not
    public static boolean isAbundantNumber(int number) {
        if (number <= 0) {
            return false;
        }
        return sumOfProperDivisors(number) > number;
    }

     //Method to check number is deficient or not
     public static boolean isDeficientNumber(int number) {
        if (number <= 0) {
            return false;
        }
        return sumOfProperDivisors(number) < number;
    }
  
     //Method to find factorial 
     public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
     }

     //Method to find  the number is strong or not
     public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        return sum == originalNumber;
     } 

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter a number : ");
         int number = sc.nextInt();

         //displaying the final results
         System.out.println("\n Is perfect Number? " + isPerfectNumber(number) +
                            "\n IS Abundant number? " + isAbundantNumber(number) +
                            "\n Is Deficient Number?" + isDeficientNumber(number) +
                            "\n Is strong Number?" + isStrongNumber(number));
     }
}