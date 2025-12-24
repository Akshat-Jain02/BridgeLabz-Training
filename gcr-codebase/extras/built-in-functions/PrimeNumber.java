import java.util.Scanner;

public class PrimeNumber {

    //Method to find the number is prime or not
    public static boolean isPrime(int num) {
        if (num <= 1) {
           return false; // 0 and 1 are not prime
        }
        for (int i = 2; i * i <= num; i++) {
            //If divisible by any number from 2 to less than the number itself it is not prime
            if (num % i == 0) {
                return false;
            }
        }
     
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking the number as input from user
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        //Printing the final result
        if (isPrime(number)) {
            System.out.println("The number " + number + " is a Prime number");
        } else {
           System.out.println("The number " + number + " is not a Prime number");
        }

        sc.close();
    }
}