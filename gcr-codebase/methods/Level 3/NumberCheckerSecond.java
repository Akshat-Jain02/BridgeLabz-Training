import java.util.Scanner;

public class NumberCheckerSecond {
     //Static method to find the count of digits in a number
     public static int countDigits(int number) {
        number = Math.abs(number);

        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
     }

     //Static method to get the digits array
     public static int[] getDigitsArray(int number) {
        number = Math.abs(number);
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

     //Static method to get the sum of digits of a number
     public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    //Static method to get the sum of squares of digits of a number
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    //Static method to determine whether the number is harshad or not
    public static Boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return sum != 0 && number % sum == 0;
    }

    public static int[][] findDigitFrequency(int[] digits) {
        
        int[][] frequency = new int[10][2];

        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }
 
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]][1]++;
        }

        return frequency;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        int digitsCount = countDigits(number);
        int[] digits = getDigitsArray(number);

        System.out.println("The count of digits in number " + number + " is " + digitsCount);

        System.out.println("Digits are : ");

        for (int i = 0; i < digits.length; i++) {
            System.out.println(digits[i] + " ");
        }

        int sum = sumOfDigits(digits);
        double sumOfSquares = sumOfSquaresOfDigits(digits);
        System.out.println("\n Sum of digits is : " + sum +
                           "\n Sum of Squares of digits : " + sumOfSquares +
                           "\n Is Harshad number : " + isHarshadNumber(number, digits));

        int[][] frequency = findDigitFrequency(digits);

        //Displaying the digit along with the frequency of it 
        System.out.println("\nDigit Frequency:");
        System.out.println("Digit | Frequency");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("  " + frequency[i][0] + "   |    " + frequency[i][1]);
            }
        }

        sc.close();


    }

}