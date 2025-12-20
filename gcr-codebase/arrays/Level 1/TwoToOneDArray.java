import java.util.Scanner;

//Created a class TwoToOneDArray to copy element from two d array to one d array
public class TwoToOneDArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns : ");
        int columns = sc.nextInt();

        int[][] arr = new int[rows][columns];
        
        //Taking the element of matrix from the user
        System.out.println("Enter elements of matrix : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
     
        int[] array = new int[rows * columns];
        int index = 0;
         
         //Copying the element from the Two D array to one D array
         for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = arr[i][j];
            }
         }
         
         //Printing the element from the one d array
         System.out.println("\nElements in 1D array:");
         for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
         }

         sc.close();

    }
}
