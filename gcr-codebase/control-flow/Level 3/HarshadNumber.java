import java.util.Scanner;

//Create a HarshadNumber class to check the number is Hasrshad or not
public class HarshadNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        
        int sum = 0;
        int originalNumber = number;

        // Loop to extract each digit one by one by using modulo operation by 10
        while (originalNumber != 0) {

            // Get last digit by modulo operator
            int digit = originalNumber % 10;

            // Add digit to sum
            sum = sum + digit;

            // Remove last digit
            originalNumber = originalNumber / 10;
        }

        // Check divisibility of the number
        if (sum != 0 && number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is NOT a Harshad Number.");
        }

        sc.close();
    }
}
