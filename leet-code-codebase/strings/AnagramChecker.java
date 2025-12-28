import java.util.Scanner;

public class AnagramChecker {

    //Method to find String is anagram or not
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] nums = new int[26];

        for (int i = 0; i < s.length(); i++) {
            nums[s.charAt(i) - 'a']++;
            nums[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (nums[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking user input
        System.out.print("Enter first string: ");
        String s = sc.nextLine().toLowerCase();

        System.out.print("Enter second string: ");
        String t = sc.nextLine().toLowerCase();

        //Calling the medthod to find string is anagram or not
        boolean result = isAnagram(s, t);

        //Printing the final result
        System.out.println("Are the strings anagrams? " + result);

        sc.close();
    }
}
