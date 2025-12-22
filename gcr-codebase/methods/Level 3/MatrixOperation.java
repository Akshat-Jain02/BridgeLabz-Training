import java.util.Scanner;

public class MatrixOperation {

     //Method to create random matrix
     public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10); // 0–9
            }
        }
        return matrix;
    }

    //Method to add two matrix
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    //Method to subtract two matrix
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

     //Method to multiply matrix
     public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }
  
    //Method to display matrix
    public static void display(int[][]matrix) {
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns");
        int columns = sc.nextInt();

        int[][] matrix1 = createRandomMatrix(rows,columns);
        int[][] matrix2 = createRandomMatrix(rows,columns);

        System.out.println("Matrix 1 : ");
        display(matrix1);

        System.out.println("Matrix 2 : ");
        display(matrix2);

        System.out.println("\nAddition (1 + 2):");
        display(addMatrices(matrix1, matrix2));

        System.out.println("\nSubtraction (1 - 2):");
        display(subtractMatrices(matrix1, matrix2));

        System.out.println("\nMultiplication (1 x 2):");
        display(multiplyMatrices(matrix1, matrix2));

        sc.close();
    }
}