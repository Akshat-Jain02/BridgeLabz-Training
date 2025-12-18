import java.util.Scanner;

//Create a IsSmallestOfThree class to find is first number the smallest 

public class IsSmallestOfThree {

    public static void main(String[] args) {
    
       Scanner sc = new Scanner(System.in);
       
       //taking three number as input 
       System.out.println("Enter the first number : ");
       int number1 = sc.nextInt();
       System.out.println("Enter the second number : ");
       int number2 = sc.nextInt();
       System.out.println("Enter the third number : ");
       int number3 = sc.nextInt();
       
       //Checking for the first number is smallest or not
       if (number1 < number2 && number1 < number3) {
           System.out.println(" Is the first number the smallest?  Yes");
       } else {
           System.out.println(" Is the first number the smallest?  No");
       } 
       
       sc.close();
       
    }
}