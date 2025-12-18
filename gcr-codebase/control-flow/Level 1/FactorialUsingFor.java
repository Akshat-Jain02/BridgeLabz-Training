import java.util.Scanner;

//Create a FactorialUsingFor class to calculate factorial using for loop

public class FactorialUsingFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //Taking the number as input from user        
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        
        if (number < 0 ) {
            System.out.println("Please enter the posistive number");
        } else {
            //declare a variable factorial to hold the factorial of a number
            int factorial = 1;
        
            //Using for loop to calculate factorial
            for (int i = number; i >= 1; i--) {

                //Multiplying the factorial variable by decrementing the value of i
                factorial *= i;
            }
        
            //Printing the factorial of a number
            System.out.println("The factorial of " + number + " is " + factorial );
       }

        sc.close();
    }
}