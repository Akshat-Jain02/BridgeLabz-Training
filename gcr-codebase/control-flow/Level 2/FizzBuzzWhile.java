import java.util.Scanner;

//Created class FizzBuzzWhile to print fizz, buzz and fizzbuzz

public class FizzBuzzWhile {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       
       //taking the number as input from user
       System.out.println("Please enter then number");
       int number = sc.nextInt();
       
       //Checking whether the number is positive or if positive print
       if (number <= 0) {
          System.out.println("Please enter a positive number");  
       } else {

          int i = 1;

          //using a while loop to print fuzz,Buzz, FizzBuzz iteratively;
          while (i <= number) {
              if (i % 3 == 0 && i % 5 == 0) {
                  System.out.println("FizzBuzz");
              } else if (i % 5 == 0) {
                  System.out.println("Buzz"); 
              } else if (i % 3 == 0) {
                  System.out.println("Fizz");
              } else {
                  System.out.println(i);
              }

              //incrementing the value of i after each print
              i++;
          
          }
       }

       sc.close();
        
    }
}