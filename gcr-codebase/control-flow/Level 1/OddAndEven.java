import java.util.Scanner;

//Created a OddAndEven class to show the number is even or odd upto the inputed range

public class OddAndEven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        //taking the input from user
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        
        //checking whether the number is natural or not and if natural find even or odd
        if (number < 0) {
            System.out.println("Please enter the natural number");
        }  else {
            for (int i = 1; i <= number; i++) {
                System.out.println("The number " + i + "  is" + 
                                   (i % 2 == 0 ? "Even" : "Odd"));
            }
        }

        sc.close();
    }
}