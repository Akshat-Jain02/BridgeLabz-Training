import java.util.Scanner;

//Create a CountDigitsOfInteger to count the number of digits in a integer
public class CountDigitsOfInteger {

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        //Take integer input from the user and store it in number variable
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;

        //Loop until number becomes 0
        while (number != 0) {

            //remove the last digit
            number = number / 10;

            //  Increment count by 1
            count++;
        }

        // Print the count
        System.out.println("Number of digits = " + count);

        sc.close();
    }
}
