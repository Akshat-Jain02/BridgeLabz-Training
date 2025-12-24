import java.util.Scanner;

public class FactorialRecursion {
    //Method to take input from user
    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        sc.close();
        return number;
    }

    //Methot to find factorial of a number
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } 
 
        return n * factorial(n - 1);
    }

    //Method to display results
    public static void displayFactorial(int num, long result) {
        System.out.println("Factorial of " + num + " is: " + result);
    }

 
    public static void main(String[] args) {
         int number = getInput();
         //Calling the methods
         long result = factorial(number);
         displayFactorial(number, result);
    }
}