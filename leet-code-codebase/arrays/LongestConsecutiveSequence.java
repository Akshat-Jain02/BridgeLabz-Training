import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutiveSequence {

    //Method to find the longest consecutive sequence of numbers
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0;

        for (int n : nums) {
            set.add(n);
        }

        for (int x : set) {
            // start only when x is the beginning of a sequence
            if (!set.contains(x - 1)) {
                int count = 1;
                int current = x;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking the input from user
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        //Calling the method to get the longest consecutive sequence
        int result = longestConsecutive(nums);

        //Printing the final result
        System.out.println("Length of longest consecutive sequence: " + result);

        sc.close();
    }
}
