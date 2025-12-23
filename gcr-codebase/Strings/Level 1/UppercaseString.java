import java.util.Scanner;

public class UppercaseString {

    //Method to convert the string to uppercase
    public static String convertToUppercase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if ( ch >= 'a' && ch <='z') {
                ch = (char)(ch - 32);
            }

            result += ch;
        }
        return result;
    }

    //Method to compare two string return true if equal else false
    public static Boolean compareStrings(String s1,String s2) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking the text as input from user
        System.out.println("Enter the text :");
        String text = sc.nextLine();

        // Convert using user-defined method
        String customUppercase = convertToUppercase(text);

        // Convert using built-in method
        String builtInUppercase = text.toUpperCase();

        // Compare both results
        boolean isSame = compareStrings(customUppercase, builtInUppercase);

        //displaying the results
        System.out.println("\n Custom Uppercase : " + customUppercase +
                           "\n Built-in Uppercase : " + builtInUppercase +
                            "\n Are Both equal ? "+ isSame);

        sc.close();
    }


}