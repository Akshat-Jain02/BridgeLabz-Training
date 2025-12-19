import java.util.Scanner;

//Create a class FactorsOfNumbers which find all the factors of a given number
public class FactorsOfNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        //Taking the number as an input from user 
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
         
        //checking whether the number is positive or not of if positive find and print fact
        if (number <= 0) {
            System.out.println("Please enter the positive number");
        }  else {
            
             for (int i = 1; i < number; i++) {
                 
                 //if i divides the number then it is a factor of that number print it
                 if (number % i == 0) {
                     System.out.println(i);
                 }
             }
        }
         
        sc.close();      
    }
}