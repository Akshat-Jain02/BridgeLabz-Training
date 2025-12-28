import java.util.Scanner;

public class Colors {

    //Method to swap two numbers in an array
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    //Method to sort the colors
    public static void sortColors(int[] nums) {
        int i = 0, j = nums.length - 1, idx = 0;

        while (idx <= j) {
            if (nums[idx] == 1) {
                idx++;
            } 
            else if (nums[idx] == 0) {
                swap(nums, i, idx);
                i++;
                idx++;
            } 
            else { // nums[idx] == 2
                swap(nums, idx, j);
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking user input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements (only 0, 1, 2):");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        //Calling the appropriate method
        sortColors(nums);

        //Printing the final result
        System.out.println("Sorted colors:");
        for (int x : nums) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
