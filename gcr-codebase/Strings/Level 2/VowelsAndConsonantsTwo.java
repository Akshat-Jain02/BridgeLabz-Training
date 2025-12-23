import java.util.Scanner;

public class VowelsAndConsonantsTwo {

    //Method to find character is vowel or consonant
    public static String checkCharacter(char ch) {

        // Convert uppercase to lowercase using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if character is an alphabet
        if (ch >= 'a' && ch <= 'z') {

            // Check vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    
    // Method to create 2D array of character and its type
    public static String[][] findCharacterTypes(String text) {

        int len = text.length();
        String[][] result = new String[len][2];

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacter(ch);
        }

        return result;
    }

    //Method to display the result
    public static void displayTable(String[][] table) {
        System.out.println("\nCharacter\tType");
        System.out.println("--------------------------");

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        //Enter a string as an input from user
        System.out.println("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = findCharacterTypes(text);
        displayTable(result);

        sc.close();
    }
}