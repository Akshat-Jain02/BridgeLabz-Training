import java.util.Scanner;

//created a CompareSumOfNaturalFor class to compute and compare sum of n natural numbers

public class CompareSumOfNaturalFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         
        //Taking the input
        System.out.println("Enter the value of number");
        int number = sc.nextInt();
        
        //Checking the number is natural or not or if natural ten calculate sum
        if (number <= 0) {
            System.out.println("Not a Natural number");
        }  else {
            int sumUsingFormula = ( number * (number + 1)) / 2;
            int sumUsingForLoop = 0;
            
            //using for loop to calculate sum of n natural numbers
            for (int i = 1; i <= number; i++) {

                 //aggregating the sum of natural number one by one
                 sumUsingForLoop += i;

            }

            //Printing the sum using formula as well as while loop 
            System.out.println("Sum of " + number + " natural number using formula is " +
                                sumUsingFormula + " while using for loop is " + 
                                sumUsingForLoop);  
       }

       sc.close();
          
    }
}