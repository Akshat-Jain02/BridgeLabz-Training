//Create a FeeDiscount class to calculate discount and the discounted fee

public class FeeDiscount {

    public static void main(String[]args) {
        
        //Create a variable fee to hold initial fee
        int fee = 125000;

        //Create a variable discountPercent to hold the discount percentage
        int discountPercent = 10;

        //Create a variable discountAmount to hold the discount amount
        double discountAmount = (discountPercent / 100.0) * fee;

        //Create a variable discountedFee to hold the fee after discount 
        double discountedFee = fee - discountAmount;

        //Print the discount amount and the fee after discount
        System.out.println("The discount amount is INR " + discountAmount + 
                           " and final discounted fee is INR " + discountedFee);
        
    }
}