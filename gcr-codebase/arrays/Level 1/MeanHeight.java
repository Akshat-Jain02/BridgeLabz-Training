import java.util.Scanner;

//Create a class MeanHeight to print the mean height of football team
public class MeanHeight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;
 
        //taking the heights as an input
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Please enter the height");
            heights[i] = sc.nextDouble();
        }
        
        //using for loop to iterate over the heights array
        for (int i = 0; i < heights.length; i++) {
            //adding the height to the sum one by one
            sum += heights[i];
        }
        
        //Calculating the mean by dividing the sum of heights with the 11
        double mean = sum / heights.length;
        
        //Printing the mean height of the Football team
        System.out.println("The mean height of the football team is " + mean);
 
        sc.close(); 
    }
}