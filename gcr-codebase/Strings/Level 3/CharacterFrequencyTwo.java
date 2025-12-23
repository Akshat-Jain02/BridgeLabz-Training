import java.util.Scanner;

public class CharacterFrequencyTwo {

    // Method to find unique characters using charAt() and nested loops
    public static char[] uniqueCharacters(String text) {
        char[] temp = new char[text.length()];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if character already exists
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, add to array
            if (isUnique) {
                temp[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create exact size array
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Method to find frequency and return 2D array
    public static String[][] characterFrequency(String text) {

        
        int[] frequency = new int[256];

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Get unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // 2D array to store character and frequency
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(frequency[ch]);
        }

        return result;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking the string as input from user
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] output = characterFrequency(text);

        System.out.println("\nCharacter Frequency:");
        System.out.println("---------------------");
        System.out.println("Character\tFrequency");

        //printing the output
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i][0] + "\t\t" + output[i][1]);
        }

        sc.close();
    }
}
