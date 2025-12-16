import java.util.Scanner;
class KilometersToMiles {
    public static void main(String [] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the distance in kilometers : ");
       double distance = sc.nextDouble();
       double disInMiles = distance * 0.621371;
       System.out.println("Distance in miles is: " + disInMiles);
    }
}