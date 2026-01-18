import java.util.*;

public class MajorityElement {

    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int piv = nums[0], count = 0, t = nums.length / 3;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == piv)
                count++;
            else {
                piv = nums[i];
                count = 1;
            }

            if (count > t && !list.contains(nums[i]))
                list.add(nums[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of element");
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element");
            nums[i] = sc.nextInt();
        }

        MajorityElement obj = new MajorityElement();
        List<Integer> result = obj.majorityElement(nums);

        System.out.println(result);
    }
}
