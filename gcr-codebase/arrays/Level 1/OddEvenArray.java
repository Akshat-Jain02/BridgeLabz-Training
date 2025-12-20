import java.util.Scanner;

//created a class OddEvenArray to print the odd and even numbers upto the given number
public class OddEvenArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number");
        int number = sc.nextInt();
        
        //check for the valid natural number
        if (number <= 0) {
            System.err.println("Error : please enter a natural number");
            System.exit(0);
        }

        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];
        
        int evenIndex = 0;
        int oddIndex = 0;
      
        //checking and entering the odd even value in the corresponding array
        for (int i = 1; i <= number; i++) {
            
            if (i % 2 == 0) {
                even[evenIndex++] = i;
            } else {
                odd[oddIndex++] = i;
            }
        }
       
        // Printing the odd number
        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        //Print the  even numbers
        System.out.println("\n\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
        
        sc.close();

    }
}