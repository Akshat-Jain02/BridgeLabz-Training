import java.util.Scanner;

public class RotatedArrayMinimumElement {

    //Method to find minimum element in the rotated array
    public static int findMin(int[] nums) {
        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            // Check pivot conditions
            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            if (mid < nums.length - 1 && nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }

            // Decide which half to search
            if (nums[mid] <= nums[s]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return nums[0]; // array not rotated
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking user input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter rotated sorted array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        //Calling the method to find the minimum element
        int min = findMin(nums);

        //Printing the final result
        System.out.println("Minimum element in rotated array: " + min);

        sc.close();
    }
}
