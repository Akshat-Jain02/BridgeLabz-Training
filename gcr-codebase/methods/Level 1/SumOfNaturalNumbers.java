import java.util.Scanner;

//Create a  SumOfNaturalNumbers class to calculate and display sum of natural numbers
public class SumOfNaturalNumbers {
 
    //Created a method sum to calculate sum and return the sum 
    public static int sum(int n) {
        //Formula to calculate sum of natural numbers
        return (n * (n + 1))/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        //Please enter the number
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int result = sum(n);
  
        //Printing the sum of n  natural numbers
        System.out.println("The sum of " + n + " natural number is " + result);
       
        sc.close();
    }
}