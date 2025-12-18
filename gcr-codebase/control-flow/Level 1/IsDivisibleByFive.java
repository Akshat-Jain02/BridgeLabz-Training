import java.util.Scanner;

//Create a IsDivisibleByFive to check number is divisible by 5 or not
public class IsDivisibleByFive {

    public static void main(String[]args) {
        
        Scanner sc = new Scanner(System.in);
        
        //Take a input from user
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        
        //print true or false based on whether the number is divisible by 5 or not
        if (number % 5 == 0) { 
            System.out.println("Is the number " + number + " divisible by 5?" + "Yes" );
        } else {
            System.out.println("Is the number " + number + " divisible by 5?" + "No");
        }        
        
        sc.close();
    }
}