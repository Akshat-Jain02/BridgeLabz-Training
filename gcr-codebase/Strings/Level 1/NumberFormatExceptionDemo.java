import java.util.Scanner;

public class  NumberFormatExceptionDemo {
  
    //Method to generate  NumberFormatException
    public static void generateNumberFormatException(String text) {
        Integer.parseInt(text);
    }
    
    //Method to handle  NumberFormatException
    public static void handleNumberFormatException(String text) {
        try {
            Integer.parseInt(text);
        } catch ( NumberFormatException e) {
            System.out.println("Handling the exception");
            System.out.println("Error : " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Handling generic exception");
            System.out.println("Error : " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        //Taking the input
        System.out.println("Enter the number");
        String text = sc.next();

        //Display section
        try {
            generateNumberFormatException(text);
        } catch(NumberFormatException e) {
            handleNumberFormatException(text);
        } catch(Exception e) {
            System.out.println("Handling the generic exception :");
            System.out.println("Error : "+ e.getMessage());
        }

    }
}