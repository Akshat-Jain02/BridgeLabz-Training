import java.util.*;

public class Happiness {

    public static long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int piv = 0, index = happiness.length - 1;
        long ans = 0;

        while (k-- > 0) {
            if (happiness[index] <= piv)
                break;
            ans += happiness[index--] - piv;
            piv++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] happiness = new int[n];

        // Input array elements
        System.out.println("Enter happiness values:");
        for (int i = 0; i < n; i++) {
            happiness[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        // Call static method directly (no object creation)
        long result = maximumHappinessSum(happiness, k);

        // Output result
        System.out.println("Maximum Happiness Sum = " + result);

        sc.close();
    }
}
