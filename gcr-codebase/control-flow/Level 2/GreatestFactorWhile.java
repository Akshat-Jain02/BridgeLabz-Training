import java.util.Scanner;

//Create a GreatestFactorWhile class to find the greatest factor of a number
public class GreatestFactorWhile {

    public static void main(String[] args) {

        //Created a Scanner class object to take input
        Scanner sc = new Scanner(System.in);
        //taking the number as  input from user
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        
        //create a variable greatestFactor to hold the greatest factor of a number
        int greatestFactor = 1;
        
        int counter = number - 1;
        //iteratively checking the divisibility of number from last until we find one
        while (counter >= 1) {
            
            //The first number to divide the number from last is the greatest factor
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            //decrement the counter by one
            counter--;
        }
       
        //Print the greatest factor
        System.out.println("The gratest factor of " + number + " is " + greatestFactor);

        sc.close();
    }
}