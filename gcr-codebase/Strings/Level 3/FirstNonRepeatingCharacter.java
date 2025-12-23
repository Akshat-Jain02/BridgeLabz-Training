import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find first non-repeating character
    public static char findFirstNonRepeatingChar(String text) {

        int[] frequency = new int[256];

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // Find first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (frequency[ch] == 1) {
                    return ch;
                }
        }

        // no non-repeating character found
        return '\0';
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        //Taking the input from user
        System.out.println("Enter a String : ");
        String text = sc.nextLine();

        //Calling the appropriate method
        char result = findFirstNonRepeatingChar(text);

        //Displaying the result
        if (result != '\0') {
            System.out.println("First non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }

        sc.close();
    }   
}