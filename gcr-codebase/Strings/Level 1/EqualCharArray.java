import java.util.Scanner;

public class EqualCharArray {

    //Method to generate character array by taking character from the string one by one
    public static char[] generateCharArray(String text) {
        
        char[] characterArray = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            characterArray[i] = text.charAt(i);   
        }

        return characterArray;
    }

 
    //Method to compare two character arrays
    public static boolean compareArray(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
 
        return true;
    }
 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking the string as an input from user
        System.out.println("Enter the text : ");
        String text = sc.next();

        //Populate both the arrays
        char[] charArray1 = generateCharArray(text);
        char[] charArray2 = text.toCharArray();

        boolean isCharArrayEqual = compareArray(charArray1, charArray2);

        //Printing the final results
        System.out.println("The two generated character arrays are equal ? " + isCharArrayEqual);
    }
} 