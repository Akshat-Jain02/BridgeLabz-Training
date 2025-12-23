import java.util.Scanner;

public class ShortestLongestWord {

    // Method to find length of a string without using in-built length method
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // end of string
        }
        return count;
    }

    // Method to split text into words using charAt() in-built method
    public static String[] splitWords(String text) {
        int len = findLength(text);

        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (text.charAt(i) == ' ') {
                inWord = false;
            }
        }

        // Extract words
        String[] words = new String[wordCount];
        int index = 0;
        String word = "";

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ') {
                word += text.charAt(i);
            } else if (!word.equals("")) {
                words[index++] = word;
                word = "";
            }
        }

        if (!word.equals("")) {
            words[index] = word;
        }

        return words;
    }

    // Method to create 2D array of word and its length
    public static String[][] createWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int length = findLength(words[i]);
            table[i][0] = words[i];
            table[i][1] = String.valueOf(length);
        }
        return table;
    }

    // Method to find shortest and longest string indexes
    public static int[] findShortestAndLongest(String[][] table) {
        int minIndex = 0;
        int maxIndex = 0;

        int minLength = Integer.parseInt(table[0][1]);
        int maxLength = Integer.parseInt(table[0][1]);

        for (int i = 1; i < table.length; i++) {
            int currentLength = Integer.parseInt(table[i][1]);

            if (currentLength < minLength) {
                minLength = currentLength;
                minIndex = i;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String[] words = splitWords(input);
        String[][] wordTable = createWordLengthTable(words);
        int[] resultIndexes = findShortestAndLongest(wordTable);

        System.out.println("\nWord\t\tLength");
        System.out.println("------------------------");

        for (int i = 0; i < wordTable.length; i++) {
            int length = Integer.parseInt(wordTable[i][1]);
            System.out.println(wordTable[i][0] + "\t\t" + length);
        }

        //Printing the shortest and longest word
        System.out.println("\nShortest Word: " +
                wordTable[resultIndexes[0]][0]);

        System.out.println("Longest Word: " +
                wordTable[resultIndexes[1]][0]);

        sc.close();
    }
}
