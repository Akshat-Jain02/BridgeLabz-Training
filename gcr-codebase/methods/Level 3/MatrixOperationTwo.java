import java.util.Scanner;

public class MatrixOperationTwo {

    //Method to populate matrix 
    public static double[][] createRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 9) + 1;
            }
        }
        return matrix;
    }
    
    //Method to find transpose of matrix
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] result = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    //Method to find determinant of 2 x 2 matrix
    public static double determinant2x2(double[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    //Method to find determinant of 3 x 3 matrix
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    //Method to finnd inverse of 2 x 2 matrix
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);

        if (det == 0) {
            System.out.println("Inverse not possible (Determinant = 0)");
            return null;
        }

        double[][] inv = new double[2][2];
        inv[0][0] =  m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] =  m[0][0] / det;

        return inv;
    }

     //Method to find inverse of 3 x 3 matrix
     public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);

        if (det == 0) {
            System.out.println("Inverse not possible (Determinant = 0)");
            return null;
        }

        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / det;

        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return transpose(inv); // adjoint = transpose of cofactor
    }

    //Method to display matrix
    public static void displayMatrix(double[][]matrix) {
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
  

        double[][] matrix2 = createRandomMatrix(2, 2);
        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix2));

        System.out.println("\nDeterminant (2x2): " + determinant2x2(matrix2));

        System.out.println("\nInverse (2x2):");
        displayMatrix(inverse2x2(matrix2));

        // 3x3 matrix
        double[][] matrix3 = createRandomMatrix(3, 3);
        System.out.println("\n3x3 Matrix:");
        displayMatrix(matrix3);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix3));

        System.out.println("\nDeterminant (3x3): " + determinant3x3(matrix3));

        System.out.println("\nInverse (3x3):");
        displayMatrix(inverse3x3(matrix3));

        
    }
}