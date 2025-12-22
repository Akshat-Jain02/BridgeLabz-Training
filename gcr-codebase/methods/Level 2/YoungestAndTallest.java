import java.util.Scanner;

public class YoungestAndTallest {

    // Method to find the youngest friend among three friends
    public static int findYoungest(int[] ages) {
        int youngestIndex = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }

    // Method to find the tallest friend among three friends
    public static int findTallest(double[] heights) {
        int tallestIndex = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return tallestIndex;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};

        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take input for age and height of three friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] +  ":");
            heights[i] = sc.nextDouble();
        }

        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);

        // Display results the tallest and youngest friend
        System.out.println("Youngest friend is: " + names[youngestIndex] +
                " (Age: " + ages[youngestIndex] + ")");

        System.out.println("Tallest friend is: " + names[tallestIndex] +
                " (Height: " + heights[tallestIndex] + " )");

        sc.close();
    }
}
