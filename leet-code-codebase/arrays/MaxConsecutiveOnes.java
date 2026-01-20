public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;

        for (int n : nums) {
            if (n != 0) {
                count++;
                max = max > count ? max : count;
            } else {
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};

        int result = findMaxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive ones: " + result);
    }
}
