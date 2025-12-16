import java.util.Scanner;
class AreaOfCircle {
   public static void main(String[]args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the radius of circle");
      double radius = sc.nextDouble();
      double area = Math.PI * Math.pow(radius , 2);
      System.out.println("Area of a circle is : " + area);   
   }
}