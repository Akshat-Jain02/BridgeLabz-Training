import java.util.Scanner;

public class NumberFactors {

   //Static method to find and return the factors by storing them in an array
   public static int[] findFactors(int number) {
       
       int count = 0;
       for (int i = 1; i <= number; i++) {
           if (number % i == 0) {
               count++;
           }
       }

       int[] factors = new int[count];

       int index = 0;
       for (int i = 1; i <= number; i++) {
           if(number % i == 0) {
               factors[index++] = i;
           }
       }
       return factors;

   } 
 
   //Static method to find sum of factors
   public static int findSum(int[] factors) {
       int sum = 0;
       for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
   }
 
   //static method to find product of factors
   public static long findProduct(int[] factors) {
       long product = 1;
       
       for (int i = 0; i < factors.length; i++) {
            product *= factors[i];    
       }
       return product;
   }
   
   //Static metho to find sum of squares of factors
   public static double findSumOfSquares(int[] factors) {
       double sumOfSquares = 0.0;
       for (int i = 0; i < factors.length; i++) {
           sumOfSquares += Math.pow(factors[i], 2);
       }
       return sumOfSquares;
   }

   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.println("Factors of number " + number + " are ");
      
        //Printing the factors of a number
        for (int i = 0; i < factors.length; i++) {
            System.out.println(factors[i] + " ");
        }

        //Printing the final results
        System.out.println("\n sum of factors is : " + findSum(factors) +
                           "\n Product of factors is : " + findProduct(factors) + 
                            "\n Sum of squares of factor is : " + findSumOfSquares(factors));
 
    }
}