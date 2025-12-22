import java.util.Scanner;

public class PositiveNegativeZero {

    //Create a method getPositiveNegativeZero to return -1 , 1 and 0 based on integer
    public static int getPositiveNegativeZero(int number) {
 
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
   
        //taking the number as an input from user    
        System.out.println("Enter the integer : ");
        int number = sc.nextInt();
        
        int res = getPositiveNegativeZero(number);
 
        //Displaying  the results accordingly
        if (res == 1) {
            System.out.println("The number " + number + "is Positive");
        } else if (res == -1) {
           System.out.println("The number " + number + "is Negative");
        } else {
            System.out.println("The number " + number + "is zero");
        }


    }
} 