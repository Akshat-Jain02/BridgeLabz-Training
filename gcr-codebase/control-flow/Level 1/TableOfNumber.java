import java.util.Scanner;

//Create a TableOfNumber class to find multiplication of inputed number

public class TableOfNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //Taking the input from user
        System.out.println("Enter the integer number : ");
        int number = sc.nextInt();
        
        System.out.println("Multiplication table of " + number + " is");
        
        //using for loop for multiplication and printing
        for (int i = 6; i <= 9; i++) {
            int temp = number * i;
            
            //printing the number along with its multiplication from 6 to 9
            System.out.println(number + " * " + i + " = " + temp); 
        }
        
        sc.close();
    }
}