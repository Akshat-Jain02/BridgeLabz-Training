import java.util.Scanner;

//Create a RocketLauncherCounter class to count down the number

public class RocketLaunchCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      
        //taking the countdown value as input from user
        System.out.println("Enter the counter value :");
        int counter = sc.nextInt();

       //using while loop to incrementally print the countdown value
        while (counter >= 1) {

               //Printing the counter value
               System.out.println(counter);
               
               //Decrement the value of counter
               counter -= 1;
        }
        
        sc.close();
 
    }
}