import java.util.Scanner;
import java.util.Arrays;

public class RotateArray {

    //This method reverses elements of the array
    public static void inverse(int[] nums, int a, int b) {
        while (a < b) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }
    }

    public static void rotate(int[] nums, int k) {

        // Handle k greater than array length
        k = k % nums.length;

        // Step 1: Reverse entire array
        inverse(nums, 0, nums.length - 1);

        // Step 2: Reverse first k elements
        inverse(nums, 0, k - 1);

        // Step 3: Reverse remaining elements
        inverse(nums, k, nums.length - 1);
    }

    //Main method: takes input from user
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input rotation steps
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        rotate(nums, k);

        System.out.println("Rotated Array: " + Arrays.toString(nums));

        sc.close();
    }
}
