import java.util.Scanner;

//Created a LargestOfThree class to print which number is largest of three

public class LargestOfThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
       //taking three number as input 
       System.out.println("Enter the first number : ");
       int number1 = sc.nextInt();
       System.out.println("Enter the second number : ");
       int number2 = sc.nextInt();
       System.out.println("Enter the third number : ");
       int number3 = sc.nextInt();
     
       boolean isNum1Largest = false, isNum2Largest = false, isNum3Largest = false;
       
       //Checking and printing which number is largest of three
       if (number1 > number2 && number1 > number3) {
           isNum1Largest = true;
           
       } else if (number2 > number1 && number2 > number3){
           isNum2Largest = true;
          
       } else if (number3 > number1 && number3 > number2) {
           isNum3Largest = true;
          
       }
       
       System.out.println("Is the first number the largest? " +
                          (isNum1Largest ? "Yes" : "No"));
       System.out.println("Is the second number the largest? " +
                           (isNum2Largest ? "Yes" : "No"));
       System.out.println("Is the third number the largest? " +
                           (isNum3Largest ? "Yes" : "No"));
       sc.close();

    }
}