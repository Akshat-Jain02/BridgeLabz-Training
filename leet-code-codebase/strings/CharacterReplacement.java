import java.util.Scanner;

public class CharacterReplacement {

    //Method for character replacement
    public static int characterReplacement(String s, int k) {
        int i = 0, j = 0, max = 0, ans = 0;
        int[] nums = new int[26];

        while (j < s.length()) {
            nums[s.charAt(j) - 'A']++;
            max = Math.max(max, nums[s.charAt(j) - 'A']);

            if ((j - i + 1) - max > k) {
                nums[s.charAt(i) - 'A']--;
                i++;
            }

            ans = Math.max(ans, j - i + 1);
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input as user from user
        System.out.print("Enter the string (uppercase letters): ");
        String s = sc.nextLine().toUpperCase();

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        //Calling the method
        int result = characterReplacement(s, k);

        //Printing the final result
        System.out.println("Length of longest repeating character substring: " + result);

        sc.close();
    }
}
