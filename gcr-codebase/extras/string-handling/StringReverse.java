import java.util.Scanner;

public class StringReverse {

    //Method to reverse the string 
    public static String reverse(String text) {
        String res = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            res += text.charAt(i);
        }

        return res;
    }
    public static void main(String[] args) {
 
       Scanner sc = new Scanner(System.in);
  
       //Taking the input from user
       System.out.println("Enter the String: ");
       String text = sc.next();

       //calling the appropriate method
       String reverseString = reverse(text);
      
       //Printing the reverse String
       System.out.println("The reverse string is : " + reverseString);

       sc.close();

    }
}