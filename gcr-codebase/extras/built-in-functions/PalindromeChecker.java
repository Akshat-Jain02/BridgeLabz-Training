import java.util.Scanner;

public class PalindromeChecker {

    //Method to take input from user
    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        sc.close();
        return str;
    }

    //Method to check String is palindrome or not
    public static boolean isPalindrome(String str) {

        str = str.replaceAll("\\s", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    //Method to display result
    public static void displayResult(String str, Boolean result) {
        if (result) {
            System.out.println("String : " + str + " is palindrome ");
        } else {
           System.out.println("String : " + str + " is not a palindrome ");
        }
    }
    
    public static void main(String[] args) {
          
        //Calling the appropriate method
        String input = getInput();
        boolean result = isPalindrome(input);

        displayResult(input, result);
    }
}