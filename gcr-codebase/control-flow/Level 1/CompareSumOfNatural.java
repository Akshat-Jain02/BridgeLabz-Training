import java.util.Scanner;

//created a CompareSumOfNatural class to compute and compare sum of n natural numbers

public class CompareSumOfNatural {

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
            int sumUsingWhileLoop = 0;
            while (number != 0) {
                sumUsingWhileLoop += number;
                number--;    
            }
            
            //Printing the sum using formula as well as while loop 
            System.out.println("Sum of " + number + " natural number using formula is " +
                                sumUsingFormula + " while using while loop is " + 
                                sumUsingWhileLoop);  
       }

       sc.close();       
          
    }
}