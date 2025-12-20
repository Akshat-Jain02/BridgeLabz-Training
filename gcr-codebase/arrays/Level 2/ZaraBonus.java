import  java.util.Scanner;

//Create a ZaraBonus class to calculate bonus of ten employees based on the year of service
public class ZaraBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalEmployees = 10;
        
        double[] salary = new double[totalEmployees];
        double[] yearsOfService = new double[totalEmployees];
        double[] bonus = new double[totalEmployees];
        double[] newSalary = new double[totalEmployees];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        
         //Taking the input from the user
         for (int i = 0; i < totalEmployees; i++) {

            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter salary: ");
            double sal = sc.nextDouble();

            System.out.print("Enter years of service: ");
            double yrs = sc.nextDouble();

            // Validation
            if (sal <= 0 || yrs < 0) {
                System.err.println("Invalid input!");
                // decrement index to re-enter data
                i--;
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = yrs;
        }
         
         //insert the bonus of employees into the array based on the year of service
         for (int i = 0; i < totalEmployees; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; 
            } else {
                bonus[i] = salary[i] * 0.02; 
            }

            newSalary[i] = salary[i] + bonus[i];

            // Calculate totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        //Display results
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();

        
    
    }
}