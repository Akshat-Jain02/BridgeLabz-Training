import java.util.Scanner;

public class MissingNumber {

    //Finds the missing number in the range [0, n]
    public static int missingNumber(int[] nums) {

        int sum = 0;
        int n = nums.length;

        // Calculate sum of array elements
        for (int num : nums) {
            sum += num;
        }

        // Expected sum of numbers from 0 to n
        int expectedSum = (n * (n + 1)) / 2;

        // Missing number = expected sum - actual sum
        return expectedSum - sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements (from 0 to " + n + " with one missing):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = missingNumber(nums);

        System.out.println("Missing Number: " + result);

        sc.close();
    }
}
