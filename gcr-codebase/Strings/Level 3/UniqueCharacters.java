import java.util.Scanner;

public class UniqueCharacters {
    
    //Method to find length of string using in-built length() method
    public static int getLengthOfString(String text) {
        return text.length();
    }

    //Method to find unique characters in a String using loop and charAt() method
    public static char[] findUniqueCharacatersArray(String text) {
        int length = getLengthOfString(text);
        char[] temp = new char[length];
        int index= 0;

        for (int i = 0; i < text.length(); i++) {
            boolean isUnique = true;
            char ch = text.charAt(i);

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[index++] = ch;
            }
        }

        // Create new array for exact size
        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking the string as an input from user
        System.out.println("Enter a String :");
        String text = sc.nextLine();

        //Calling the method 
        char[] uniqueCharacters = findUniqueCharacatersArray(text);

        //Displaying the unique characters
        System.out.println("Unique characters are:");
        for (int i = 0; i < uniqueCharacters.length; i++) {
            System.out.print(uniqueCharacters[i] + " ");
        }

        sc.close();
    }
    
}