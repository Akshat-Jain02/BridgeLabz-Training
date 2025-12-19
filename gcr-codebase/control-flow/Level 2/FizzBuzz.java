import java.util.Scanner;

//Created class FizzBuzz to print fizz, buzz and fizzbuzz
public class FizzBuzz {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       
       //taking the number as input from user
       System.out.println("Please enter then number");
       int number = sc.nextInt();
       
       //Checking whether the number is positive or if positive print
       if (number <= 0) {
          System.out.println("Please enter a positive number");  
       } else {
          for (int i = 1; i <= number; i++) {
              if (i % 3 == 0 && i % 5 == 0) {
                  System.out.println("FizzBuzz");
              } else if (i % 5 == 0) {
                  System.out.println("Buzz"); 
              } else if (i % 3 == 0) {
                  System.out.println("Fizz");
              } else {
                  System.out.println(i);
              }
          
          }
       }

       sc.close();
        
    }
}