import java.util.Scanner;

//Create a class Abundant number to find whether the number is adbundant or not
public class AbundantNumber {

    public static void main(String[] args) {

        // Created a Scanner class object to take input from user 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;

        // loop from 1 to number-1
        for (int i = 1; i < number; i++) {

            // Check if i is a divisor of a number
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        //Check if sum is greater than number itself
        if (sum > number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }

        sc.close();
    }
}
