import java.util.Scanner;

class LongestCommonPrefix {

    // static method to find longest common prefix
    public static String longestCommonPrefix(String[] strs) {
        String piv = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(piv)) {
                piv = piv.substring(0, piv.length() - 1);
            }
            if (piv.isEmpty())
                return "";
        }
        return piv;
    }

    // main method taking input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strs[i] = sc.nextLine();
        }

        String result = longestCommonPrefix(strs);
        //Displaying the final results
        System.out.println("Longest Common Prefix: " + result);

        sc.close();
    }
}
