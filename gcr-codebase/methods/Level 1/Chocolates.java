import java.util.Scanner;

public class Chocolates {
 
   //method to calculate number of chocolates eacch student get and the remaining ones
   public static int[] findRemainderAndQuotient(int number, int divisor) {
       int[] res = new int[2];
     
       //Store the number of chocolates each children get
       res[0] = number / divisor;
       //Store the number of remaining chocolates in the res[1] by using modulo operation
       res[1] = number % divisor;

       return res;
   } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        //Taking the number of i
        System.out.println("Enter the number of chocolates");
        int numberOfChocolates = sc.nextInt();

        System.out.println("Enter the number of children");
        int numberOfChildrens = sc.nextInt();
 
        //method calling and storing the results
        int[] res = findRemainderAndQuotient(numberOfChocolates, numberOfChildrens);
        
        //Printing the final results 
        System.out.println("The number of chocolates each children get is " + res[0] +
                           " and the reamining chocolates is  " + res[1]);
    }
}