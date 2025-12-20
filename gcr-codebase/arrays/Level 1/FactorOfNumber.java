import java.util.Scanner;

//Create a FcatorsOfNumber class to display factord of number
public class FactorsOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //Taking the number as an input
        System.out.println("Enter the number : ");
        int number = sc.nextInt();

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;
        
        //for each value of i to number check if it is factor of a number or not
        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                //  Resize array if full
                if (index == maxFactor) {
                    maxFactor = maxFactor * 2;

                    int[] temp = new int[maxFactor];

                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    factors = temp;
                }

                //  Store factor
                factors[index] = i;
                index++;
            }
        }

        //display factor 
        System.out.println("\nFactors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        
    }
}