import java.util.Scanner;

public class EqualSubstring {
    
    //Generate the substring using charAt()
    public static String generateSubstring(String string, int start, int end) {
        String res = "";

        for (int i = start; i < end; i++) {
            res += string.charAt(i);
        }

        return res;
    }
  
    //comparing string using charAt() method 
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
 
        System.out.println("Enter a String : ");
        String string = sc.next();
  
        System.out.println("Enter start index");
        int start = sc.nextInt();

        System.out.println("Enter end index");
        int end = sc.nextInt();

        String subString1 = string.substring(start,end);
        String subString2 = generateSubstring(string, start, end);
        boolean isEqual = compare(subString1,subString2);

        //Printing the final results
        System.out.println("The substring generated from in-built method is : " + subString1 + 
                           " and using custom method is : " + subString2 +
                            "\n Strings are equal?" + isEqual);
      
    }
}