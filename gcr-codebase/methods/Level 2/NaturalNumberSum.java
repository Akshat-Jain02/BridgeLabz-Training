import java.util.Scanner;

public class NaturalNumberSum {

    //Calculating the sum of n natural number using recursion
    public static int sumOfNaturalNumberRec(int n) {
        if (n == 1) {
           return 1;
        } 
        return n + sumOfNaturalNumberRec(n - 1);
    }

    //Calculating the sum of n natural number using formula
    public static int sumOfNaturalNumberForm(int n) {
        return (n * (n + 1))/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter the number :");
        int number = sc.nextInt();
     
        //Method calling and storing the results
        int sumUsingRecursion = sumOfNaturalNumberRec(number);
        int sumUsingFormula = sumOfNaturalNumberRec(number);
        
        //Printing the result
        System.out.println("The sum using recursion is :" + sumUsingRecursion + 
                           " and the sum using formula is : " + sumUsingFormula);
        sc.close();
    }
}