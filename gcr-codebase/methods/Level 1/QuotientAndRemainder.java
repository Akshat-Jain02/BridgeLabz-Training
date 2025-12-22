import java.util.Scanner;

public class QuotientAndRemainder {

   public static int[] findRemainderAndQuotient(int number, int divisor) {
       int[] res = new int[2];
       
       //store the quotiet using division operation i res[0]
       res[0] = number / divisor;
       //store the remainder in the res[1] using modulooperator 
       res[1] = number % divisor;

       return res;
   }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        System.out.println("Enter the divisor : ");
        int divisor = sc.nextInt();
        
        //Method calling and storing the result
        int[] res = findRemainderAndQuotient(number, divisor);
        
        //Printing the quotient and remainder
        System.out.println("The quotient of " + number  + "with divisor " + divisor+ " is :"          
                            + res[0] + " and remainder is : " + res[1]);

        sc.close();
    }
}