import java.util.Scanner;

//Created a class MutiplesOfNumber to find the mutiples of number below 100 
public class MultiplesOfNumber {

    public static void main(String[] args) {
        
        //creating a Scanner class object to take input
        Scanner sc = new Scanner(System.in);
   
        //Taking the number as input from user
        System.out.println("Please enter the number"); 
        int number = sc.nextInt();

        if (number <= 0 || number > 100) {
            System.out.println("The number should be positive and less than 100");
        }  else {
            for (int i = 100; i >= 1; i--) {
                 //If a number divides the i then it is a multiple and print it
                 if (i % number == 0) {
                     System.out.println(i);

                     //continue the loop
                     continue;
                 }  
            }
        }

        sc.close(); 
    }
}