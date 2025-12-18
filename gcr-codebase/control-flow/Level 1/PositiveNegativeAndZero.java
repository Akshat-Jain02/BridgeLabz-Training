import java.util.Scanner;

//created a PositiveNegativeAndZero class to check number is positive, negative or zero

public class PositiveNegativeAndZero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        //Take the number as input   
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
         
        //check whether a number is positive, negative or zero
        if (number > 0) {
            System.out.println("Positive");     
        }  else if (number < 0) {
            System.out.println("Negative");
        }  else  {
            System.out.println("Zero");
        }
      
        sc.close();     
    }
}