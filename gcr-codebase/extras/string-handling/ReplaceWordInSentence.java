import java.util.Scanner;

public class ReplaceWordInSentence {

    // Method to replace a word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" ");
        String res = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord)) {
                res += newWord;
            } else {
                res += words[i];
            }
            res += " ";
        }

        return res.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking the input from user
        System.out.println("Enter the sentence : ");
        String sentence = sc.nextLine();
        System.out.println("Enter the word to be replace");
        String oldWord = sc.next();
        System.out.println("Enter the new word :");
        String newWord = sc.next();

        //Calling the appropriate method
        String modifiedSentence = replaceWord(sentence, oldWord, newWord);

        //Printing the final result
        System.out.println("Modified Sentence:");
        System.out.println(modifiedSentence);

        sc.close();
    }
}
