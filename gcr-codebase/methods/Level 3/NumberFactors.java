import java.util.Scanner;

public class NumberFactors {
     public static int[] findFactors(int number) {
        int count = 0;

        //count the number of factors of a number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create array of size count
        int[] factors = new int[count];
        int index = 0;

        //find and store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
     }

     //Method to find greatest factor
     public static int findGreatestFactor(int[] factors) {
        int greatest = factors[0];

        for (int i = 0; i < factors.length; i++) {
            if (factors[i] > greatest) {
                greatest = factors[i];
            }
        }
        return greatest;
     }
 
    //Method to find su of factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;

        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }
   
    //Method to find product of factors
    public static long findProductOfFactors(int[] factors) {
        long product = 1;

        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    //Method to find product of cube of factors
    public static double findProductOfCubeOfFactors(int[] factors) {
        double product = 1;

        for (int i = 0; i < factors.length; i++) {
            product *= Math.pow(factors[i], 3);
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.println("Factors are : ");
        for (int i = 0; i < factors.length; i++) {
            System.out.println(factors[i] + " ");
        }

        //Printing the appropriate results
        System.out.println("\n Greatest Factor: " + findGreatestFactor(factors) +
                           "\n Sum of Factors : " +findSumOfFactors(factors) +
                           "\n Product of Factors: " + findProductOfFactors(factors) +
                           "\n Product of cube of factors:" + 
                            findProductOfCubeOfFactors(factors));
       sc.close();
        
    }

}