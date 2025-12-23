import java.util.Scanner;

public class TextSplitter {

    // Method to find length of String
    public static int findLength(String text) {
        return text.length();
    }

    // Method to split text into words using charAt()
    public static String[] customSplit(String text) {
        int length = findLength(text);

        // Count words
        int wordCount = 0;
        boolean isWord = false;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ' && !isWord) {
                wordCount++;
                isWord = true;
            } else if (text.charAt(i) == ' ') {
                isWord = false;
            }
        }

        //Store space indexes
        int[] spaceIndexes = new int[wordCount + 1];
        int index = 0;
        spaceIndexes[index++] = -1; 

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index] = length;

        // Extract words
        String[] words = new String[wordCount];
        int wordIndex = 0;

        for (int i = 0; i < spaceIndexes.length - 1; i++) {
            int start = spaceIndexes[i] + 1;
            int end = spaceIndexes[i + 1];

            if (start < end) {
                String word = "";
                for (int j = start; j < end; j++) {
                    word += text.charAt(j);
                }
                words[wordIndex++] = word;
            }
        }
        return words;
    }

    // Method to compare two String arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking the input from user
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        //calling the appropriate methods
        String[] customWords = customSplit(input);
        String[] builtInWords = input.split(" ");

        System.out.println("\nCustom Split Result:");
        for (String word : customWords) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in split() Result:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        boolean result = compareArrays(customWords, builtInWords);
        System.out.println("\nAre both results equal? " + result);

        sc.close();
    }
}
