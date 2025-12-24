import java.util.Scanner;

public class ToggleCase {

    //Method to toggle the case of character of String
    public static String findToggleCase(String text) {

        //Create a variable res to Store the character after toggling
        String res = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 97) {
                ch = (char)(ch - 32);
            } else {
                ch = (char)(ch + 32);
            }
 
            res += ch;
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        //Taking String as input from user
        System.out.println("Enter a String : ");
        String text = sc.next();

        //Calling the findToggleCase() method
        String toggleString = findToggleCase(text);
 
        //printing the toggled string
        System.out.println("The toggled String is : " + toggleString);

        sc.close();
    }
}