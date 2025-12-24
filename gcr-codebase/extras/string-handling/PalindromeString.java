import java.util.Scanner;

public class PalindromeString {
    //Method to find String is Palindrome or not
    public static boolean findIsPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
       
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking the string as input from user
        System.out.println("Enter the String : ");
        String text = sc.next();

        //Calling the appropriate method
        boolean isPalindrome = findIsPalindrome(text);
        
        //printing te result
        System.out.println("Is the give String palindrome? : " + isPalindrome); 
 
        sc.close();
    
    }
}