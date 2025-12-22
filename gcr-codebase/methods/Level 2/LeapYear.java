import java.util.Scanner;

public class LeapYear {
    
    //method to check for whether the year is leap year or not
    public static boolean checkLeapYear(int year) {
        if (year < 1582) {
            return false;
        } else if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
       
        //Method calling
        boolean isLeapYear = checkLeapYear(year);
        
        //Printing the year is leap or not
        System.out.println(isLeapYear ? "Leap year" : "Not a leap year");

        sc.close();
        
    }
}