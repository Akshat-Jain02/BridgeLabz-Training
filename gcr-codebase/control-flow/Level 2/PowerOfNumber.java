import java.util.Scanner;

//Create a class PowerOfNumber to find the power of a number
public class PowerOfNumber {

    public static void main(String[] args) {

        //Created a Scanner class object to take input
        Scanner sc = new Scanner(System.in);

        //Taking the number and power as an input from user
        System.out.println("Please enter the number");
        int number = sc.nextInt();
        System.out.println("Please enter the power");
        int power = sc.nextInt();
        
        if (number <= 0 || power <= 0) {
            System.out.println("please enter the positive number");
        }  else {
            //initialize a variable result to 1 to store the result
            int result = 1;
        
             //Iteratively multiply number from 1 upto power using for loop
             for (int i = 1; i <= power; i++) {
                 //multiplying the result by number and reassign to itself
                 result *= number;
             }

             System.out.println("The power " + power + " of " + number + " is " + result);
 
        }   
        sc.close();
    }
}