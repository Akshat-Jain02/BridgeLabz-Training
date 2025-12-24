import java.util.Scanner;

public class AnagramsString {
     public static boolean areAnagrams(String str1, String str2) {
         // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths differ, not anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] freq = new int[256];

        // Increase count for first string
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)]++;
        }

        // Decrease count for second string
        for (int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i)]--;
        }

        // Check frequency array
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
     }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first String : ");
        String s1 = sc.next();

        System.out.println("Enter the second String : ");
        String s2 = sc.next();

        boolean isAnagram = areAnagrams(s1, s2);
        System.out.println("Are the Strings " + s1 + " and " + s2 +" are anagrams ? " + isAnagram);
        sc.close();
    }
}