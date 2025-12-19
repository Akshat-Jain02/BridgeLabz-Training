import java.util.Scanner;

public class LeapYearSecond {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the year");
        int year = sc.nextInt();
        
         //if a year is divisible by 400 and divisible by 4 and not 100 then it's a leap year
         if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
             System.out.println("The year " + year + "is a leap year");
         } else {
             System.out.println("The year " + year + "is not a leap year");
          }
        

        sc.close();
    }
}