import java.util.Scanner;

public class CharacterFrequencyThree {

    // Method to find character frequencies using nested loops
    public static String[] findCharacterFrequency(String text) {

        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                continue;
            }

            freq[i] = 1; // Initialize frequency to 1

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // Mark duplicate
                }
            }
        }

        // Count unique characters
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        // Create 1D String array to store result
        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " : " + freq[i];
                index++;
            }
        }

        return result;
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Taking the text as input from user
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        //Calling the appropriate method
        String[] output = findCharacterFrequency(text);

        System.out.println("\nCharacter Frequency:");
        System.out.println("--------------------");
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }

        sc.close();
    }
}
