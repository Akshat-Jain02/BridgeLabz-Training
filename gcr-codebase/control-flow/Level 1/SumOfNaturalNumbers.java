import java.util.Scanner;

//Created a class SumOfNaturalNumbers to check and print sum of n natural numbers

public class SumOfNaturalNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //taking the number as input
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        
        //checking the is natural or not and if natural then printing sum of natural numbers
        if (number < 0) {

            System.out.println("The number " + number + " is not a natural number");

        } else {
            
            int SumOfNaturalNum = (number * (number + 1)) / 2; 
            System.out.println("The sum of " + number+ " natural numbers is " +   
                                SumOfNaturalNum ); 
        }

        sc.close();
    }
}