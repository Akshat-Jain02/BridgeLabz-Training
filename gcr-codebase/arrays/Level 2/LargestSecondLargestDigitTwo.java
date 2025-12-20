import java.util.Scanner;

//Created a LargestSecondLargestDigitTwo class to find largest and second largest digits
public class LargestSecondLargestDigitTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Take user input 
        System.out.print("Enter the number: ");
        long number = sc.nextLong();

        
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        //Store digits with dynamic resizing
        while (number != 0) {

            // Increase array size if index == maxDigit
            if (index == maxDigit) {
                maxDigit = maxDigit + 10;

                int[] temp = new int[maxDigit];

                // Copy old array to new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp;
            }

            digits[index] = (int) (number % 10);
            index++;

            number = number / 10;
        }

        // Initialize largest and second largest variable with zero
        int largest = 0;
        int secondLargest = 0;

        //iterate over the array and  find largest and second largest digits
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display result
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}
