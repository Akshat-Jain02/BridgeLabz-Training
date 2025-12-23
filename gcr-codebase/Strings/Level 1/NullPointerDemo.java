public class NullPointerDemo {

    //Method to generate NullPointerException 
    public static void generateNullPointerException() {
        String text = null;
        text.length();
    }

    //Method to handle NullPointerException
    public static void handleNullPointerException() {
        String text = null;
        try {
            text.length();
        } catch (NullPointerException e) {
            System.out.println("Error:" + e.getMessage());
            System.out.println("The NullPointerException is handled");
            System.out.println("----------------------------------" +
             "\n The program is running wihtout abnormal termination");
        }

    }
    public static void main(String[] args) {
        try {
            //calling the method to generate NullPointerException
            generateNullPointerException();
        } catch (NullPointerException e) {
            //Calling the method to handle NullPointerException
            handleNullPointerException();
        }
    }
}