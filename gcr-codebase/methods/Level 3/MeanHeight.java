import java.util.Scanner;

public class MeanHeight {

    //Static method to find sum of heights 
    public static int findSumOfHeights(int[] heights) {
       
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return sum;
    }
  
    //Static method to find mean height
    public static double findMeanHeight(int[] heights) {
        int sum = findSumOfHeights(heights);
        return (double) sum / heights.length;
    }

    //Static method to find shortest height
    public static int findShortestHeight(int[] heights) {
        int shortestHeight = heights[0];
        for (int i = 0; i < heights.length; i++) {
            shortestHeight = Math.min(shortestHeight, heights[i]);
        }

        return shortestHeight;
    }    
 
    //Static method to find tallest friend
    public static int findTallestHeight(int[] heights) {
        int tallestHeight = heights[0];

        for (int i = 0; i < heights.length; i++) {
            tallestHeight = Math.max(tallestHeight, heights[i]);
        }
        return tallestHeight;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] heights = new int[11];

        //Generating random heights and populate the array
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int)(Math.random() * 101) + 150;
        }
        
        System.out.println("Height of football player in cm is ");

        for (int i = 0; i < heights.length; i++) {
            System.out.print(heights[i] + " ");
        }
  
        //calling the appropriate method
        int sum = findSumOfHeights(heights);
        double mean = findMeanHeight(heights);
        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);

        //displaying the results
        System.out.println("\n Sum of heights is : " + sum +
                           "\n Mean height is : " + mean +
                           "\n Shortest height : " + shortest + "cm" +
                           "\n Tallest height : " + tallest + " cm");

       sc.close();
    }
}