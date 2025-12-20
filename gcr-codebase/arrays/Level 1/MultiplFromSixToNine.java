import java.util.Scanner;

//create a class MultiplFromSixToNine to print multiple of number from 6 to 9
public class MultiplFromSixToNine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //taking the input from user
        System.out.println("Pleae enter a number : ");
        int number = sc.nextInt();

        //created an array to store multiplication result
        int multiplicationResult[] = new int[4];
        
        //Calculate multiplication result from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }
        
        //display the result
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        sc.close();
    }
} 