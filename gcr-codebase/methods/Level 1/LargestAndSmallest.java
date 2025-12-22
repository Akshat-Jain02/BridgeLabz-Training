import java.util.Scanner;

//Created a class LargestAndSmallest to find the largest and smallest among three numbers
public class LargestAndSmallest {
    
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        
        int[] res = new int[2];
        
        //finding the largest number of three and store it in res[0]
        if (number1 > number2 && number1 > number3) {
           res[0] = number1;
        } else if (number2  > number1 && number2 > number3) {
           res[0] = number2;
        } else {
           res[0] = number3;
        }
      
        //finding the smallest number of three and store it in res[1]
        if (number1 < number2 && number1 < number3) {
           res[1] = number1;
        } else if (number2  < number1 && number2 < number3) {
           res[1] = number2;
        } else {
           res[1] = number3;
        }
      
        return res;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
 
        //Taking the result three numbers as an input from user
        System.out.println("Enter the first number : ");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int number2 = sc.nextInt();
        System.out.println("Enter the third number : ");
        int number3 = sc.nextInt();

        int[] res = findSmallestAndLargest(number1, number2, number3);
        
        //Printing the smallest and largest number
        System.out.println("The smallest number is " + res[1] + 
                           " and the largest number is " + res[0]);
        sc.close();
    }
}