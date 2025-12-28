import java.util.Scanner;

public class ReverseWordsApp {

    //Method to reverse a word in a String
    public static String reverseWords(String s) {
        s = s.trim();
        StringBuilder str = new StringBuilder();
        int i = s.length() - 1, j = s.length() - 1;

        while (j >= 0) {

            while (j >= 0 && s.charAt(j) == ' ') {
                j--;
            }

            i = j;
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            if (i < 0) {
                str.append(s.substring(i + 1, j + 1));
            } else {
                str.append(s.substring(i + 1, j + 1)).append(" ");
            }

            j = i;
        }

        return str.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking the String as input from user
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        //Calling the method to reverse a string
        String result = reverseWords(input);

        //Printing the final result
        System.out.println("Reversed words string:");
        System.out.println(result);

        sc.close();
    }
}
