import java.util.Scanner;

public class TextSplitterTwo {

    //method to get length of string
    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    //Method to generate the word and its count in a text
    public static String[][] generateWordData(String[] words) {
        String[][] data = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            // Calculate length manually
            int len = getLength(words[i]);
            // Convert int to String using String.valueOf()
            data[i][1] = String.valueOf(len);
        }
        return data;
    }

    //Method to split words
    public static String[] splitWords(String text) {
        // Count spaces to determine number of words
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' && text.charAt(i + 1) != ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        String currentWord = "";
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                currentWord += c;
            } else if (!currentWord.isEmpty()) {
                words[index++] = currentWord;
                currentWord = "";
            }
        }
        words[index] = currentWord; // Add last word
        return words;
    }


    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the text : ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] wordData = generateWordData(words);

        //Printing the result in tabular form
        System.out.println("\nWord\t\tLength");
        System.out.println("-----------------------");
        for (String[] row : wordData) {
            // Convert length back to Integer for display as requested
            int lengthVal = Integer.parseInt(row[1]);
            System.out.println(row[0] + "\t\t" + lengthVal);
        }
        
        sc.close();
    }
}