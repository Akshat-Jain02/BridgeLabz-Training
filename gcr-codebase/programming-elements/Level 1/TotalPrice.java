import java.util.Scanner;

//Create a TotalPrice class to calculate total price

public class TotalPrice {

    public static void main(String[]args) {

        //Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit price :");
        double unitPrice = sc.nextDouble();
        System.out.println("Enter the quantity :");
        int quantity = sc.nextInt();
        
        //calculating total price
        double totalPrice = quantity * unitPrice;
        
        //displaying the total price
        System.out.println("The total purchase price is INR " + totalPrice +
                           " if the quantity " + quantity +" and unit price is INR " +
                           unitPrice);

        sc.close();
    }
}