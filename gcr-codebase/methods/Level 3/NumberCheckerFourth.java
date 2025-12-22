import java.util.Scanner;

public class NumberCheckerFourth {

    //Method to check number is prime or not
    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
  
     //Method to check the number is neon or not
     public static boolean isNeonNumber(int number) {

        int square = number * number;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    //Method to check number is spy or not
    public static boolean isSpyNumber(int number) {

        number = Math.abs(number);
        int sum = 0;
        int product = 1;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    //Method to check number is automorphic or not
    public static boolean isAutomorphicNumber(int number) {

        int square = number * number;
        int temp = number;

        while (temp > 0) {
            if (square % 10 != temp % 10) {
                return false;
            }
            square /= 10;
            temp /= 10;
        }
        return true;
    }

    //Method to check number is buzz or not
    public static boolean isBuzzNumber(int number) {

        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number");
        int number = sc.nextInt();
 
        //Displaying the results
        System.out.println("Results are : " +
                           "\n Is Prime Number : " +  isPrime(number) +
                           "\n Is Neon Number : " + isNeonNumber(number) +
                           "\n Is Spy Number : " + isSpyNumber(number) +
                           "\n is Automorphic Number : " + isAutomorphicNumber(number)+ 
                           "\n Is Buzz Number : " + isBuzzNumber(number));
       sc.close();       
    }
}