import java.util.Scanner;

//Created a FrequencyOfDigits class to count the frequency of digits in a number
public class FrequencyOfDigits {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Please enter the number");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        // Counting number of digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
 
        int[] digits = new int[count];
        temp = number;
        int index = 0;
        
        //inserting the digits into the digits array
        while (temp != 0) {
            digits[index] = temp % 10;
            temp = temp / 10;
            index++;
        }

        int[] frequency = new int[10]; 

        //Incrementing the frequency of the digit by going to the corresponding index in an array
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        //Displaying the digit along with the frequency of that digit
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        sc.close();

    }
}