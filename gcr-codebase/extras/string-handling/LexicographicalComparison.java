import java.util.Scanner;

public class LexicographicalComparison {
    public static int compareLexicographically(String s1, String s2) {
        int length = Math.min(s1.length(), s2.length());
        boolean isUnequal = false;  
        for (int i = 0; i < length; i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if (ch1 > ch2 ) {
                isUnequal = true;
                return 2;
            } else if (ch1 < ch2) {
                isUnequal = true;
                return 1;
            }
        }
 
        if (!isUnequal) {
            return s1.length() > s2.length() ? 2 : 1;
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter the first String ");
        String s1 = sc.next();
        System.out.println("Enter the second String : ");
        String s2 = sc.next();

        int flag = compareLexicographically(s1, s2);
 
        if (flag == 1) {
            System.out.println("\n" + s1 + " comes before " + s2 + " in lexicographical order");
        } else {
            System.out.println("\n" + s2 + " comes before " + s1 + " in lexicographical order");
        }
        
        sc.close();
        
    }
}