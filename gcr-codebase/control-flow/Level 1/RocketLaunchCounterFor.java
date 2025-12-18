import java.util.Scanner;

//Create a RocketLauncherCounterFor class to count down the number using for loop

public class RocketLaunchCounterFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      
        //taking the countdown value as input from user
        System.out.println("Enter the counter value :");
        int counter = sc.nextInt();

       //using for loop to incrementally print the countdown value and decrement it
        for (int i = counter; i >= 1; i--) {
            
            // Printing the value of counter 
            System.out.println(i);
        } 
      
        sc.close(); 
    }
}