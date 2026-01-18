import java.util.*;

public class FindDuplicates {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                ans.add(index + 1);
            } else {
                nums[index] = -nums[index];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element");
            nums[i] = sc.nextInt();
        }

        FindDuplicates obj = new FindDuplicates();
        System.out.println(obj.findDuplicates(nums));
    }
}
