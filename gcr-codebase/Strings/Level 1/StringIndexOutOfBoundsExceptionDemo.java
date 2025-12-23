import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {

    //Method to generate StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException(String s) {
        s.charAt(s.length());
    }
 
    //Handling StringIndexOutOfBoundsException
    public static void handleStringIndexOutOfBoundsException(String s) {
        try {
            s.charAt(s.length());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error" + e.getMessage());
            System.out.println("--------------------------------------"+ 
                               "\n The program is running without abnormal terminartion");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Taking the input from the user
        System.out.println("Enter the word : ");
        String text = sc.next();

       try {
           generateStringIndexOutOfBoundsException(text);
       } catch (StringIndexOutOfBoundsException e) {
           handleStringIndexOutOfBoundsException(text);
       }
        
    }

}
