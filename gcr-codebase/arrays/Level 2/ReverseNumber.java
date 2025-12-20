import java.util.Scanner;

//Created a ReverseNumber class to print the number in reverse order
public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      
        //taking the number as an input from user
        System.out.println("Enter the number");
        long number = sc.nextLong();

        long temp = number;
        int count = 0;
        //using while loop count the number of digits in a number
        while (temp != 0) {
            count++;
            temp = temp/10;
        }

        int[] digits = new int[count];
        int index = 0;
        
        //insert the digits in the array interatively
        while (number != 0) {
           digits[index++] = (int)(number % 10);
           number = number / 10;
        }

        //Printing  the number in reverse order
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }

        sc.close();

    }
}