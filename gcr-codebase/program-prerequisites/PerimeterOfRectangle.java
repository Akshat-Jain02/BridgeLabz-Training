import java.util.*;
class PerimeterOfRectangle {
    public static void main(String[]args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the length of rectangle");
       double length = sc.nextDouble();
       System.out.println("Enter the width of a rectangle");
       double width = sc.nextDouble();
       double perimeter = 2 * (length + width);
       System.out.println("Perimeter of rectangle is : " + perimeter);
    }
}