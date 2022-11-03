package homeworks;

import java.util.Arrays;

public class MatrixTranspose {

    public static int[][] transpose(int[][] matrix){
        int[][] transpoze = new int[matrix[0].length][matrix.length];
        for(int i=0 ; i< transpoze.length; i++){
            for (int j=0 ; j<transpoze[i].length; j++){
                transpoze[i][j] = matrix[j][i];
            }
        }
        return transpoze;
    }

    public static void printMatrix(int[][] arr){
        for (int[] element: arr){
            System.out.println(Arrays.toString(element));
        }
    }

    public static void main(String[] args) {

        int[][] matrix = { {1,2,3},{4,5,6}};
        int[][] matrix2 = {{4,9,12,14,17},{3,4,89,45,23}};

        System.out.println("Original matrix: ");
        printMatrix(matrix);

        System.out.println("Transpose of matrix:");
        printMatrix(transpose(matrix));

        System.out.println("Original matrix: ");
        printMatrix(matrix2);

        System.out.println("Transpose of matrix:");
        printMatrix(transpose(matrix2));


    }
}
