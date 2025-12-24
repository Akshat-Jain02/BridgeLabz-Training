import java.util.Scanner;

public class LCMAndGCD {
   
   //Method to find gcd of two numbers
   public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    //Method to find the lcm of two numbers using gcd
    public static int lcm(int a , int b) {
        return (a * b) / gcd(a, b);
    }

    //Method to take input from user
    public static int[] getInput() {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[2];

        System.out.print("Enter first number: ");
        nums[0] = sc.nextInt();

        System.out.print("Enter second number: ");
        nums[1] = sc.nextInt();

        sc.close();
        return nums;
    }
  
    //Method to display rresult
    public static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
    
    public static void main(String[] args) {
        int[] nums = getInput();

        //Calling the methods
        int gcdValue = gcd(nums[0], nums[1]);
        int lcmValue = lcm(nums[0], nums[1]);

        displayResult(nums[0], nums[1], gcdValue, lcmValue);
    }
}