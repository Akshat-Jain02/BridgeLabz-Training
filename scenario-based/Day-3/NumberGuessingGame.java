/* The Number Guessing Game 
A game asks the player to guess a number between 1 and 100.
Core Java Scenario Based Problem Statements
1. Use do-while loop.
2. Give hints like "Too high" or "Too low".
3. Count attempts and exit after 5 wrong tries. */

import java.util.Scanner;

public class NumberGuessingGame {
 
    //Method to generate random number between 1 and 100
    public static int guessNumber() {
        return (int)(Math.random() * 100) + 1;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        //Varibale to store the total nuber of guesses 
        int totalGuess = 5;
        //Calling the method to store generated number
        int generatedNumber = guessNumber(), guessedNumber;

        System.out.println("\n---------- Welcome to the game ----------------");
        do {
            System.out.println("Enter you guess : ");
            guessedNumber = sc.nextInt();

            if (guessedNumber == generatedNumber) {
                System.out.println("Your guess is correct !");
                break;
            } else if (guessedNumber > generatedNumber) {
                System.out.println("Too high");
            } else {
                System.out.println("Too low");
            }
            totalGuess--;
        } while (totalGuess > 0);

        //Printing the user ran out of attempts
        if (guessedNumber != generatedNumber) {
            System.out.println("You ran out of attempts");
        }

        sc.close();
    }
}