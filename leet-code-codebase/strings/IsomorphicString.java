import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicString {

    //Method to find string is isomorphic or not
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (!map.containsKey(ch1)) {
                if (map.containsValue(ch2)) {
                    return false;
                }
                map.put(ch1, ch2);
            } else {
                if (map.get(ch1) != ch2) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking user input
        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        //Calling the method to find string is isomorphic or not
        boolean result = isIsomorphic(s, t);

        //Printing the final result
        System.out.println("Are the strings isomorphic? " + result);

        sc.close();
    }
}
