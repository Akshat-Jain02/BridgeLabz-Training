/* Phone Recharge Simulator 
Take the user's mobile operator and amount.
1. Use a switch to display offers.
2. Loop to allow repeated recharges.
3. Show balance after each recharge. */

import java.util.Scanner;

public class PhoneRechargeSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0;
        String choice;
        
        System.out.println("=== PHONE RECHARGE SIMULATOR ===");
        
        do {
            // Get operator
            System.out.print("\nEnter operator (Airtel/Jio/Voda): ");
            String operator = sc.next();
            
            // Get amount
            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();
            
            // Show offers using switch
            System.out.println("\nOffers for " + operator + ":");
            switch(operator.toLowerCase()) {
                case "airtel":
                    if(amount >= 199) System.out.println("- 1.5GB/day for 28 days");
                    else if(amount >= 99) System.out.println("- 1GB/day for 28 days");
                    break;
                    
                case "jio":
                    if(amount >= 199) System.out.println("- 2GB/day for 28 days");
                    else if(amount >= 149) System.out.println("- 1GB/day for 28 days");
                    break;
                    
                case "voda":
                    if(amount >= 199) System.out.println("- 1GB/day for 28 days");
                    else if(amount >= 149) System.out.println("- 500MB/day for 28 days");
                    break;
                    
                default:
                    System.out.println("- Standard plan activated");
            }
            
            // Add to balance
            balance += amount;
            System.out.println("Recharge successful!");
            System.out.println("Current Balance: " + balance);
            
            // Ask to continue
            System.out.print("\nAnother recharge? (yes/no): ");
            choice = sc.next();
            
        } while(choice.equalsIgnoreCase("yes"));
        
        System.out.println("\nFinal Balance: " + balance);
        System.out.println("Thank you!");
        sc.close();
    }
}