import java.util.Scanner;

public class CharacterFrequency {

   
    //Finds the frequency of characters in a given string using the charAt() 
    public static String[][] findCharacterFrequency(String text) {
        
        int[] frequencyArray = new int[256];

        // Loop through the text to populate the frequency array
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            
            frequencyArray[character]++;
        }

        // Count how many unique characters actually appeared (to size the result array)
        int uniqueCharCount = 0;
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] > 0) {
                uniqueCharCount++;
            }
        }

        // Create the 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCharCount][2];
        int resultIndex = 0;

        // Loop through the frequency array and store only the characters that appeared
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] > 0) {
                
                char character = (char) i;
                result[resultIndex][0] = String.valueOf(character);
                
                result[resultIndex][1] = String.valueOf(frequencyArray[i]);
                resultIndex++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string to find character frequencies:");
        String userInput = sc.nextLine();

        // Call the user-defined method
        String[][] frequencies = findCharacterFrequency(userInput);

        // Display the result
        System.out.println("\nCharacter Frequencies:");
        System.out.println("Character : Frequency");
        System.out.println("---------------------");
        for (String[] entry : frequencies) {
            // entry[0] is the character, entry[1] is the frequency
            System.out.println(entry[0] + " : " + entry[1]);
        }
        
        sc.close();
    }
}
