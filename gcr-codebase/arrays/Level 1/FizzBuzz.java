import java.util.Scanner;

//Create a FizzBuzz class to print fizz, Buzz, FizzBuzz and number based on condition
public class FizzBuzz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        //taking the input from the user
        System.out.println("Enter the number : ");
        int number = sc.nextInt();

        String[] results = new String[number + 1];
       
        //Looping from zero to the inputed number and store result in results array
        for (int i = 0; i<= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }
       
        //Printing the content of array along with the position
        for (int i = 0; i <= number; i++) {
             System.out.println("Position " + i + " = " + results[i]);
        }

        sc.close();

    }
}