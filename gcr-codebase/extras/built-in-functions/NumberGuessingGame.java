import java.util.Scanner;

public class NumberGuessingGame {

    // Method to generate a guess using the binary search approach
    public static int generateGuess(int low, int high) {
        return (low + high) / 2; 
    }

    // Method to get user feedback high low or correct
    public static char getFeedback(Scanner sc) {
        System.out.print("Is the guess High (h), Low (l), or Correct (c)? ");
        return sc.next().toLowerCase().charAt(0);
    }

    // Method to update range based on feedback
    public static int[] updateRange(char feedback, int guess, int low, int high) {
        if (feedback == 'h') {
            high = guess - 1;
        } else if (feedback == 'l') {
            low = guess + 1;
        }
        return new int[]{low, high};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int low = 1;
        int high = 100;
        char feedback;
        int guess;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");

        while (true) {
            guess = generateGuess(low, high);
            System.out.println("My guess is: " + guess);

            feedback = getFeedback(sc);

            if (feedback == 'c') {
                System.out.println("Yay! I guessed your number correctly.");
                break;
            }

            int[] range = updateRange(feedback, guess, low, high);
            low = range[0];
            high = range[1];
        }

        sc.close();
    }
}
