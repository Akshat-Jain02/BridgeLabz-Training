import java.util.Scanner;

public class MajorityElement {

    // Finds the majority element using Boyer-Moore Voting Algorithm.
    public static int majorityElement(int[] nums) {

        int count = 0;
        int candidate = 0;

        for (int i = 0; i < nums.length; i++) {

            // If count is zero, choose a new candidate
            if (count == 0) {
                candidate = nums[i];
            }

            // Increment or decrement count
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Candidate is guaranteed to be the majority element
        return candidate;
    }

    
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

        int result = majorityElement(nums);

        System.out.println("Majority Element: " + result);

        sc.close();
    }
}
