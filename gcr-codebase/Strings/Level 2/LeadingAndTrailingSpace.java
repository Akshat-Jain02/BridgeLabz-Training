import java.util.Scanner;

public class LeadingAndTrailingSpace {

    // Method to find start and end indexes after trimming spaces
    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String customSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
         return true;       
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text with spaces: ");
        String input = sc.nextLine();

        int[] indexes = findTrimIndexes(input);
        String customTrimmed = "";

        if (indexes[0] <= indexes[1]) {
            customTrimmed = customSubstring(input, indexes[0], indexes[1]);
        }

        String builtInTrimmed = input.trim();
        boolean isSame = compareStrings(customTrimmed, builtInTrimmed);

        System.out.println("\nCustom Trimmed String : [" + customTrimmed + "]" +
                           "\n Built-in Trim String : [" + builtInTrimmed + "]" +
                           "\n Are both equal?      : " + isSame);

        sc.close();
    }
}
