import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
 
    //Method to generateIllegalArgumentException
    public static void generateIllegalArgumentException(String text) {
        int start = text.length() - 1;
        int end = 0;
        text.substring(start, end);
    }
   
    //Method to HandleIllegalArgumentException
    public static void handleIllegalArgumentException(String text) {
        int start = text.length() - 1;
        int end = 0;
        try {
            text.substring(start, end);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

            System.out.println("-----------------------------------"+
                              "The program is running without abnormal termination");
        } catch (RuntimeException e) {
            System.out.println("generic exception is handled");
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        System.out.println("Enter the string : ");
        String text = sc.next();

        try {
            generateIllegalArgumentException(text);
        } catch(IllegalArgumentException e) {
            handleIllegalArgumentException(text);
        } catch (Exception e) {
            System.out.println("Handling generic exception");
            System.out.println(e.getMessage());
        }
    }
}
