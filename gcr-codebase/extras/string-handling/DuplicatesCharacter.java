import java.util.Scanner;

public class DuplicatesCharacter {
    
    //Method to remove duplicate character 
    public static String removeDuplicateCharacter(String text) {
        String res = "";
        //Looping through the complete string to add the non duplicate characters
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isPresent = false; 
            for (int j = 0; j  < res.length(); j++) {
                if (res.charAt(j) == ch) {
                    isPresent = true;
                    break;
                }
            }
 
            if (!isPresent) {
                res += ch;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        //Taking String as input from user
        System.out.println("Enter the String");
        String text = sc.next();

        String result = removeDuplicateCharacter(text);

        //printing  the final results
        System.out.println("The String after removing duplicate characters is : " + result);

        sc.close();
    }
}