import java.util.Scanner;

public class AnagramText {

    // Method to check if two texts are anagrams
    public static boolean isAnagram(String text1, String text2) {

        if (text1.length() != text2.length()) {
            return false;
        }

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        //Find frequency of characters in both texts
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }

        //Compare frequencies
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Taking two text as input from user
        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        boolean result = isAnagram(text1, text2);

        //Printing the result
        System.out.println("\nAnagram Check Result:");
        System.out.println("---------------------");
        if (result) {
            System.out.println("The given texts are anagrams.");
        } else {
            System.out.println("The given texts are NOT anagrams.");
        }

        sc.close();
    }
}
