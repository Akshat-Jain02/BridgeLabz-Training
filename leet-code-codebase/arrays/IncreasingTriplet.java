import java.util.*;

public class IncreasingTriplet {

    public boolean increasingTriplet(int[] nums) {
        int num1 = Integer.MAX_VALUE;
        int num2 = Integer.MAX_VALUE;

        for (int n : nums) {
            if (num1 >= n)
                num1 = n;
            else if (num2 >= n)
                num2 = n;
            else
                return true;
        }
        return false;
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

        IncreasingTriplet obj = new IncreasingTriplet();
        System.out.println(obj.increasingTriplet(nums));
    }
}
