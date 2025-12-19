import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        // Prime numbers are always greater than 1
        if (num <= 1) {
            isPrime = false;
        } else {
            // Loop from 2 to num - 1 because 1 always divide every number
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    //if even a single number divides the number then it is not a prime
                    break; 
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }

        sc.close();
    }
}

