import java.util.Scanner;

//Create a FeeDiscountInp class to calculate discount and the discounted fee

public class FeeDiscountInp {

    public static void main(String[]args) {
       
        //create object of Scanner class        
        Scanner sc = new Scanner(System.in);

        //Create a variable fee to hold initial fee
        System.out.println("Enter the initial fee");
        int fee = sc.nextInt();

        //Create a variable discountPercent to hold the discount percentage
         System.out.println("Enter the discount percent");
         int discountPercent = sc.nextInt();

        //Create a variable discountAmount to hold the discount amount
        double discountAmount = (discountPercent / 100.0) * fee;

        //Create a variable discountedFee to hold the fee after discount 
        double discountedFee = fee - discountAmount;

        //Print the discount amount and the fee after discount
        System.out.println("The discount amount is INR " + discountAmount + 
                           " and final discounted fee is INR " + discountedFee);
        
    }
}