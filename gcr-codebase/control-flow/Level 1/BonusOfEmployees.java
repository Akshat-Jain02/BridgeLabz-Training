import java.util.Scanner;

//Create a BonusOfEmployees class to calculate bonus of employees 

public class BonusOfEmployees {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //Taking the input
        System.out.println("Enter you salary");
        double salary = sc.nextDouble();
        System.out.println("Enter years of service");
        int yearOfService = sc.nextInt();

        double bonusPercentage = 0.05;
        double bonusAmount = 0.0;
        
        //Checking if the service of employee is more than 5 years or not
        if (yearOfService > 5) {
           //calculating the bonus amount
           bonusAmount = salary * bonusPercentage;
        }
        
        //printing the bonus amount
        System.out.println("The bonus amount is " + bonusAmount);

        sc.close();        
    }
}