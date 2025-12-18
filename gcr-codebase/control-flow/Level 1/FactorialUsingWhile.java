import java.util.Scanner;

//Create a FactorialUsingWhile class to calculate factorial using while loop

public class FactorialUsingWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //Taking the number as input from user        
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        
        if (number < 0) {
            System.out.println("Please enter the positive number");
        }
        else {
            //declare a variable factorial to hold the factorial of a number
            int factorial = 1;
        
            int j = number;
            while (j >= 1) {
           
                //Multiplying the number by descrementing the number by 1
                factorial *= j;
            
                j--;
            }
        
            //Printing the factorial of a number
            System.out.println("The factorial of " + number + " is " + factorial );
       }
        
        sc.close();
    }
}