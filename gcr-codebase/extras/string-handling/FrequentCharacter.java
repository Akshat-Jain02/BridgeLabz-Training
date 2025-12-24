import java.util.Scanner;

public class FrequentCharacter {
 
    //Method to find the most frequent character in a String
    public static char findMostFrequentCharacter(String str) {
        int[] freq = new int[256];

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        char mostFrequent = str.charAt(0);
        int maxCount = freq[mostFrequent];

        // Find character with maximum frequency
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] > maxCount) {
                maxCount = freq[ch];
                mostFrequent = ch;
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking the String as input from user
        System.out.println("Enter the string");
        String str = sc.next();

        //calling the method to get the character
        char mostFrequentCharacter = findMostFrequentCharacter(str);

        //Printing the most frequent character
        System.out.println("The most frequent character is " + mostFrequentCharacter);

        sc.close();
    }
}