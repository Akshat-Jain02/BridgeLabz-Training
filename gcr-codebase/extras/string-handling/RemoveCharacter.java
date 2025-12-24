import java.util.Scanner;

public class RemoveCharacter {

    //Method to remove character from String
    public static String removeCharacterFromString(String text, char ch) {
       
        String res ="";
        for (int i = 0; i < text.length(); i++) {
             //If the character of string matches the removing character don't include it
             if (text.charAt(i) != ch) {
                 res += text.charAt(i);
             }
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking the String and character to remove from String
        System.out.println("Enter the string : ");
        String text = sc.next();

        System.out.println("Enter the character to be remove");
        char ch = sc.next().charAt(0);

        //Calling the method
        String result = removeCharacterFromString(text, ch);

        //Displaying the result
        System.out.println("String after removing the " + ch + "character is :" + result);

        sc.close();
    }
}