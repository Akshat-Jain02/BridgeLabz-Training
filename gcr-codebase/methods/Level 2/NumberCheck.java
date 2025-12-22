import java.util.Scanner;

public class NumberCheck {

   //Static method to check the number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }
  
    //static method to check the number is even or odd
    public static Boolean isEven(int number) {
        return number % 2 == 0;
    }
   
    //static method to compare first and last element
    public static int compare(int number1 , int number2) {
  
       if (number1 > number2) {
          return 1;
       } else if (number1 == number2){   
          return 0;
       } else {
          return -1;
       }
   }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int[] numbers = new int[5];
 
       //Taking the input from the users
        for (int i = 0; i< numbers.length; i++) {
            System.out.println("Enter number");
            numbers[i] = sc.nextInt();
        }

        //iterating over the array to check for the positive, negative, zero and even-odd
        for (int i = 0; i < numbers.length; i++) {
            
            if (isPositive(numbers[i])) {
                System.out.print(numbers[i] + " is positive and ");
                
                if (isEven(numbers[i])) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            }  else {
                System.out.println(numbers[i] + " is Negative");
            }
        }
 
        //function calling
        int result = compare(numbers[0], numbers[numbers.length - 1]);

        //Comparison result of first and last element
        if (result == 1) {
            System.out.println("First element is greater than the last element");
        } else if (result == 0) {
            System.out.println("First element is equal to the last element");
        } else {
            System.out.println("First element is less than the last element");
        }

        sc.close();
    }
}