import java.util.Scanner;

//Create a class FactorsOfNumbersWhile which find all the factors of a given number
public class FactorsOfNumbersWhile {

    public static void main(String[] args) {
        
        //Creating a Scanner class object to take input 
        Scanner sc = new Scanner(System.in);
       
        //Taking the number as an input from user 
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
         
        //checking whether the number is positive or not of if positive find and print fact
        if (number <= 0) {
            System.out.println("Please enter the positive number");
        }  else {
             int counter = 1;
             while (counter < number) {
                 
                 //if counter divides the number then it is a factor of that number print it
                 if (number % counter == 0) {
                     System.out.println(counter);
                 }
                 //increment the value of counter after each check
                 counter++;
             }
        }
         
        sc.close();      
    }
}