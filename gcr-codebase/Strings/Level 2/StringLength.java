import java.util.Scanner;

public class StringLength {

    //Method to find length of method
    public static int findLength(String text) {
        int count = 0;

        try {
            //looping infinitely until exception arises
            while(true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            //Returning the actual count of character in string to determine the length
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking the string as input from user
        System.out.println("Enter a string ..");
        String text = sc.next();

        //calling method
        int lengthUsingCusMethod = findLength(text);
        int lengthUsingBuiltInMethod = text.length();

        //Printing the final results
        System.out.println("\n length using user- defined method : " + lengthUsingCusMethod +
                           "\n Length using built-in length() method : " + lengthUsingBuiltInMethod);

        sc.close();
    }
}