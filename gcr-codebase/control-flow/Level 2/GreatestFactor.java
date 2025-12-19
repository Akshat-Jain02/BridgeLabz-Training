import java.util.Scanner;

//Create a GreatestFactor class to find the greatest factor of a number
public class GreatestFactor {

    public static void main(String[] args) {

        //Created a Scanner class object to take input
        Scanner sc = new Scanner(System.in);
        //taking the number as  input from user
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        
        //create a variable greatestFactor to hold the greatest factor of a number
        int greatestFactor = 1;
        
        //iteratively checking the divisibility of number from last until we find one
        for (int i = number - 1; i >= 1; i--) {
            
            //The first number to divide the number from last is the greatest factor
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
       
        //Print the greatest factor
        System.out.println("The gratest factor of " + number + " is " + greatestFactor);

        sc.close();
    }
}