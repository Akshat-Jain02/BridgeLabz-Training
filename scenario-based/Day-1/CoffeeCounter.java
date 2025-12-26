import java.util.Scanner;

public class CoffeeCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String coffeeType;

        // Prices per cup
        double price = 0;
        //5 % gst on each type
        double gstRate = 0.05;

        System.out.println("Welcome to Ravi's Café ☕");

        //Taking user's choice until user enters exit
        while (true) {

            System.out.print("\nEnter coffee type (Espresso / Latte / Cappuccino) or type 'exit' to stop: ");
            coffeeType = sc.nextLine().toLowerCase();

            if (coffeeType.equals("exit")) {
                System.out.println("Thank you for visiting Ravi's Café!");
                break;
            }

            //using switch to calculate the final price based on the type of coffee
            switch (coffeeType) {
                case "espresso":
                    price = 100;
                    break;
                case "latte":
                    price = 120;
                    break;
                case "cappuccino":
                    price = 150;
                    break;
                default:
                    System.out.println("Invalid coffee type. Please try again.");
                    continue;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine(); // clear buffer

            double total = price * quantity;
            double gst = total * gstRate;
            double finalBill = total + gst;

            //Printing the final results
            System.out.println("-------- BILL --------");
            System.out.println("Coffee Type: " + coffeeType);
            System.out.println("Quantity: " + quantity);
            System.out.println("Base Price: ₹" + total);
            System.out.println("GST (5%): ₹" + gst);
            System.out.println("Total Amount: ₹" + finalBill);
            System.out.println("----------------------");
        }

        sc.close();
    }
}
