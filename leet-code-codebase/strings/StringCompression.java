import java.util.Scanner;

public class StringCompression {

    //Method to compress array of character
    public static int compress(char[] chars) {
        char piv = chars[0];
        int count = 0, idx = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == piv) {
                count++;
            } else {
                chars[idx++] = piv;

                if (count > 1) {
                    String temp = String.valueOf(count);
                    for (char ch : temp.toCharArray()) {
                        chars[idx++] = ch;
                    }
                }

                piv = chars[i];
                count = 1;
            }
        }

        // handle last character group
        chars[idx++] = piv;
        if (count > 1) {
            String temp = String.valueOf(count);
            for (char ch : temp.toCharArray()) {
                chars[idx++] = ch;
            }
        }

        return idx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking String as input from user
        System.out.print("Enter characters (no spaces): ");
        String input = sc.nextLine();

        //Converting input to character array
        char[] chars = input.toCharArray();

        int newLength = compress(chars);

        System.out.print("Compressed output: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i]);
        }

        //printing the final result
        System.out.println("\nNew length: " + newLength);

        sc.close();
    }
}
