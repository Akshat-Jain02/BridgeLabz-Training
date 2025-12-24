import java.util.Scanner;

public class SubstringCount {

    //Method to find the substring occurence in the string
    public static int findSubstringOccurences(String text, String sub) {
        int count = 0;
        for (int i = 0; i <= text.length() - sub.length(); i++) {
            if (text.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Taking the substring and string as an input from user
        System.out.println("Enter the String : ");
        String s = sc.next();

        System.out.println("Enter the substring");
        String substring = sc.next();

        //Calling the method to get the count
        int count = findSubstringOccurences(s, substring);

        //Printing the final result
        System.out.println("The substring " + substring + " occurs " + count +
                          " times in the String : " + s);

        sc.close();
    }
}