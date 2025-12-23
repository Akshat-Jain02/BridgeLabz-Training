import java.util.Scanner;

public class EqualString {

    //Method to compare two string using charAt() method
    public static boolean compare(String s1, String s2) {
        
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
   
        return true;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         //Taking the input from user
         System.out.println("Enter the first String");
         String s1 = sc.next();

         System.out.println("Enter the second string");
         String s2 = sc.next();

         boolean isEqualUsingMethod = s1.equals(s2);
         boolean isEqualUsingCustomMethod = compare(s1, s2);

         //Printing the results
         if (isEqualUsingMethod && isEqualUsingCustomMethod) {
             System.out.println("The result generated from both the method is same and  both strings are equal");
         } else {
             System.out.println("The result generated from both the method are same and strings are not equal");
         }

         sc.close();
    }
}