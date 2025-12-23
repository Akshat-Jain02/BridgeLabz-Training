import java.util.Scanner;

public class LowercaseStrings {

    //Method to convert text to lowercase
    public static String convertToLowercase(String text) {

        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            result += ch;
        }

        return result;
    }

    //Method to compare two strings 
    public static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking the text as input from user
        System.out.println("Enter the text : ");
        String text = sc.nextLine();

        // Convert using user-defined method
        String customLowercase = convertToLowercase(text);

        // Convert using built-in method
        String builtInLowercase = text.toLowerCase();

        // Compare both results
        boolean isSame = compareStrings(customLowercase, builtInLowercase);

        System.out.println("\n Custom lowercase : " + customLowercase +
                           "\n Built-in Lowercase: " + builtInLowercase +
                           "\n Are both equal? : " + isSame);

        sc.close();

    }
}