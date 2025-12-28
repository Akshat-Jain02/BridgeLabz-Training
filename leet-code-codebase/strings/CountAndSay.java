import java.util.Scanner;

class CountAndSay {

    // static helper method for the recursion
    public static String helper(String s, int n) {
        if (n == 1)
            return s;

        String str = "";
        int j = 0;
        char piv = s.charAt(0);

        while (j < s.length()) {
            int count = 0;

            while (j < s.length() && piv == s.charAt(j)) {
                count++;
                j++;
            }

            str += "" + count + piv;

            if (j < s.length())
                piv = s.charAt(j);
        }

        return helper(str, --n);
    }

    // static main logic method
    public static String countAndSay(int n) {
        return helper("1", n);
    }

    // main method taking input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        //Calling the appropriate method
        String result = countAndSay(n);
        //printing the final result
        System.out.println("Count and Say sequence at n = " + n + " : " + result);

        sc.close();
    }
}
