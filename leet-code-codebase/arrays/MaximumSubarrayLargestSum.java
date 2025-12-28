import java.util.Scanner;

public class MaximumSubarrayLargestSum {

    //Method to find max sum of sub-array
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, sum);

            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        //Calling the method to get the maximum sum
        int result = maxSubArray(nums);

        //Printing the final sum
        System.out.println("Maximum subarray sum: " + result);

        sc.close();
    }
}
