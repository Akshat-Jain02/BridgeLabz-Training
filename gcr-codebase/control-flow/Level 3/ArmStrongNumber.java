import java.util.Scanner;

public class ArmStrongNumber {
     public static void main(String[] args) {

        //  Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //  Declare variables to store sum of cubes of digits and original values
        int sum = 0;                   
        int originalNumber = number;  

        // Loop until originalNumber becomes 0 to get the digits 
        while (originalNumber != 0) {

            //Get last digit using modulus
            int digit = originalNumber % 10;
            // Find cube of the digit and add to sum
            sum = sum + (digit * digit * digit);

            //Remove last digit using division
            originalNumber = originalNumber / 10;
        }

        // Compare sum with original number to find the armstrong number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }

        sc.close();
    }
}