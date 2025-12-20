import java.util.Scanner;

//Create a LargestSecondLargestDigit class to find largest and secondd largest digit
public class LargestSecondLargestDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        //Taking the input from user
        System.out.println("Enter the number : ");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
      
        //using loop to extract digit from number one by one
        while (number != 0) {
            if (index == maxDigit) {
                break;
            }
            digits[index++] = number % 10;

            number = number / 10;
        }

        int largest = 0;
        int secondLargest = 0;
       
        //iterating over the digits array to find the largest and second largest digit
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        //Print the largest and second largest digit
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}