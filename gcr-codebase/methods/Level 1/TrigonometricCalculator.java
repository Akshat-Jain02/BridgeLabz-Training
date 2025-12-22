import java.util.Scanner;

public class TrigonometricCalculator {
    
    //method to calculate and return result of various trigonometric function
    public double[] calculateTrigonometricFunctions(double angle) {
   
        double radians = Math.toRadians(angle);
        
        double[] result = new double[3];
        result[0] = Math.sin(radians);
        result[1] = Math.cos(radians);
        result[2] = Math.tan(radians);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter angle in degree : ");
        double angle = sc.nextDouble();
        
        //Create a method to call concrete method calculateTrignometricFunctions
        TrigonometricCalculator tc = new TrigonometricCalculator();
        double[] values = tc.calculateTrigonometricFunctions(angle);
        
        //Printing the final results 
        System.out.println("Sine(" + angle + ") = " + values[0]);
        System.out.println("Cosine(" + angle + ") = " + values[1]);
        System.out.println("Tangent(" + angle + ") = " + values[2]);

        sc.close();
       
    }
}