import java.util.Scanner;

public class NumberChecker {

    //Static method to count number of digits
    public static int countDigits(int number) {

        int count = 0;
        number = Math.abs(number);

        if (number == 0) {
           return 1;
        }

        while (number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    //Static method to get digits array
    public static int[] getDigitsArray(int number) {

        number = Math.abs(number);
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count -1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
    
        return digits;
    }

    //Static method to determine whether the number is duck number or not
    public static boolean isDuckNumber(int[] digits) {

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 0) {
            
                return true;
            }
        }
       
        return false;
    } 

    //Static method to find whether the number is armstrong or rnot
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], power);
        }
    
        return sum == number;
    }

    //Static method to find largest and second digit of an number
    public static void findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest element is : " +  largest +
                           "\n Second largest is : " + secondLargest);
 
    }

    //Static method to find smallest and second smallest digit of a number
    public static void findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }

        System.out.println("Smallest digit is : " + smallest +
                           "\n Second smallest digit is : " + secondSmallest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        int digitCount = countDigits(number);
        int[] digits = getDigitsArray(number);

        System.out.println("\n Number of digits is : " + digitCount);
    
        //Printing the digits of an number
        for (int d : digits) {
            System.out.print(d + " ");
        }

        //Printing the result
        System.out.println("\n Is duck number : " + isDuckNumber(digits) +
                           "\n Is Armstrong number : " + isArmstrongNumber(number,digits));

        findLargestAndSecondLargest(digits);
        findSmallestAndSecondSmallest(digits);
      
        sc.close();
    
    }
}