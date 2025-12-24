import java.util.Scanner;

public class MaximumOfThreeNumbers {

    //Method to get the maximum number of the three number
    public static int findMaximum(int[] numbers) {
        int max = numbers[0];
 
        if (numbers[1] > max) {
            max = numbers[1];
        } 
        
        if (numbers[2] > max) {
            max = numbers[2];
        }
 
        return max;
    }

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];
        //Taking three number as input from user
        System.out.println("Enter first number");
        numbers[0] = sc.nextInt();
 
        System.out.println("Enter second number");
        numbers[1] = sc.nextInt();

        System.out.println("Enter third number");
        numbers[2] = sc.nextInt();
        sc.close();
        return numbers;
     
    }
    public static void main(String[] args) {
        
        
        int[] numbers = takeInput(); 
       
        //Calling the method to get maximum number
        int maxNumber = findMaximum(numbers);

        //Printing the final results
        System.out.println("The maximum number is : " + maxNumber);

    }
}