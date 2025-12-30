import java.util.Scanner;

public class BestTimeToBuyAndSellStock {

    //This method calculates the maximum profit that can be achieved
    public static int maxProfit(int[] prices) {

        // Array to store minimum price till each day
        int[] minPriceSoFar = new int[prices.length];

        int min = Integer.MAX_VALUE;

        //Build minPriceSoFar array
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            minPriceSoFar[i] = min;
        }

        int maxProfit = 0;

        //Calculate maximum profit from right to left
        for (int i = prices.length - 1; i >= 0; i--) {
            maxProfit = Math.max(maxProfit, prices[i] - minPriceSoFar[i]);
        }

        return maxProfit;
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        // Input stock prices
        System.out.println("Enter stock prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int profit = maxProfit(prices);

        System.out.println("Maximum Profit: " + profit);

        sc.close();
    }
}
