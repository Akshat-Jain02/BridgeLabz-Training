import java.util.Scanner;

//Create a class SimpleInterest to calculate simple interest
public class SimpleInterest {
    
    //Create a method simpleInterest to return SI after calculating
    public static double simpleInterest(double principal, double rate, double time) {
         return (principal * rate * time) / 100;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //Take input from user
        System.out.println("Enter the principal");
        double principal = sc.nextDouble();
        System.out.println("Enter the rate");
        double rate = sc.nextDouble();
        System.out.println("Enter the time");
        double time = sc.nextDouble();
         
        //Print the final result
        System.out.println("The Simple Interest is " + simpleInterest(principal,rate,time) + 
                           " for Principal " + principal + ", Rate of Interest " + rate +
                           " and Time " + time);
        sc.close();
    }
}