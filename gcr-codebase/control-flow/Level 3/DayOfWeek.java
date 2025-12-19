import java.util.Scanner;

//Create a class DayOfWeek that takes date as input and prints the day of the week
public class DayOfWeek {

    public static void main(String[] args) {

        // Take command line arguements from the args array
        int m= Integer.parseInt(args[0]);
        int d= Integer.parseInt(args[1]);
        int y= Integer.parseInt(args[2]);

        //formula to find out the day of the week using formula
        int y0= y- (14-m)/12;
        int x= y0 + (y0/4) - (y0/100) + y0/400;
        int m0= m + 12 * ((14 - m) / 12) -2;
        int d0= (d + x + 31*m0 / 12) % 7;
        
        // Displaying the result
        // Use a switch statement to print the day of the week
        switch (d0) {
            case 0:
                System.out.println("0 (Sunday)");
                break;
            case 1:
                System.out.println("1 (Monday)");
                break;
            case 2:
                System.out.println("2 (Tuesday)");
                break;
            case 3:
                System.out.println("3 (Wednesday)");
                break;
            case 4:
                System.out.println("4 (Thursday)");
                break;
            case 5:
                System.out.println("5 (Friday)");
                break;
            case 6:
                System.out.println("6 (Saturday)");
                break;
            default:
                System.out.println("Invalid day calculation.");
                break;
        }

    }
}