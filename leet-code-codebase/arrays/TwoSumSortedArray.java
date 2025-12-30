import java.util.Scanner;
import java.util.Arrays;

public class TwoSumSortedArray {

    //Method to return the index (1- based) that sums up to the target value
    public static int[] twoSum(int[] numbers, int target) {

        int[] ans = new int[2];

        int f = 0;                      // first pointer
        int l = numbers.length - 1;     // last pointer

        while (f <= l) {

            int sum = numbers[f] + numbers[l];

            if (sum == target) {
                // Problem requires 1-based indexing
                ans[0] = f + 1;
                ans[1] = l + 1;
                break;
            }
            else if (sum > target) {
                l--;    // decrease sum
            }
            else {
                f++;    // increase sum
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        // Input sorted array
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        int[] result = twoSum(numbers, target);

        System.out.println("Indices (1-based): " + Arrays.toString(result));

        sc.close();
    }
}
