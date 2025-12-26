import java.util.*;

class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int mid = (s + e) >> 1;   // same as (s + e) / 2

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                s = mid + 1;
            else
                e = mid - 1;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input sorted array
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        // Call static method
        int index = searchInsert(nums, target);

        // Output result
        System.out.println("Target should be at index: " + index);

        sc.close();
    }
}
