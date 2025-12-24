import java.util.Scanner;

public class LongestWord {
 
    //Method to find the longest word in a Sentence
    public static String findLongestWord(String text) {
        String[] words = text.split("\\s+");

        int maxLength = words[0].length();
        String res = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > maxLength) {
               res = words[i];
               maxLength = words[i].length();
            }       
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking the Sentence as input from user
        System.out.println("Enter the text :");
        String text = sc.nextLine();

        String longestWord = findLongestWord(text);
 
        //Printing the longest word
        System.out.println("The longest word in a sentence is : "+ longestWord);  

        sc.close();
    }
}