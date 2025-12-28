import java.util.Scanner;

public class ReverseCharArray {

    //Method to reverse a character array
    public static void reverseString(char[] s) {
        int n = s.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = s[i];
            s[i] = s[n - 1 - i];
            s[n - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking String as input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        //Converting the String to char Array
        char[] arr = input.toCharArray();

        //Calling the method to reverse array
        reverseString(arr);

        //Printing the final result
        System.out.print("Reversed string: ");
        System.out.println(new String(arr));

        sc.close();
    }
}
