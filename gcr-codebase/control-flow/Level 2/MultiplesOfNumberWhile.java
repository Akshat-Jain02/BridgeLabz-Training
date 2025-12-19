import java.util.Scanner;

//Created a class MutiplesOfNumberWhile  to find the mutiples of number below 100 
public class MultiplesOfNumberWhile {

    public static void main(String[] args) {
        
        //creating a Scanner class object to take input
        Scanner sc = new Scanner(System.in);
   
        //Taking the number as input from user
        System.out.println("Please enter the number"); 
        int number = sc.nextInt();

        if (number <= 0 || number > 100) {
            System.out.println("The number should be positive and less than 100");
        }  else {
            int counter = 100;
            while (counter > 1) {
                 //If a number divides the counter then it is a multiple and print it
                 if (counter % number == 0) {
                     System.out.println(counter);
                 }
                 //decrement the counter by 1
                 counter--;  
            }
        }

        sc.close(); 
    }
}