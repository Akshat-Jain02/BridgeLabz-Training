import java.util.Scanner;

public class VowelsAndConsonants {

    //Method to count the vowels and consonants
    public static int[] findCountOfVowelsAndConsonants(String text) {
       int[] counts = new int[2];
       int vowelsCount = 0;
       int consonantsCount = 0;
       for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E'|| ch == 'I' ||ch == 'O' || ch =='U' ) {
                vowelsCount++;
            } else {
                consonantsCount++;
            }
        }
 
        counts[0] = vowelsCount;
        counts[1] = consonantsCount;
 
        return counts;
         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking the string as input from user
        System.out.println("Enter the String : ");
        String text = sc.next();
 
        int[] counts = findCountOfVowelsAndConsonants(text);

        //Printing the results
        System.out.println("\n Count of vowels is : " + counts[0] +
                           "\n Count of consonants is : " + counts[1]);

       sc.close();
        
    }
}