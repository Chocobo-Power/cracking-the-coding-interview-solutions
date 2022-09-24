// ZeroMatrix.java 2022-09-24

import java.util.*;

public class ZeroMatrix {

    static void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            System.out.println("---------------------");
            System.out.print("| ");
            for (int cell : row) {
                if (cell != 0) {
                    System.out.printf("  ");
                    System.out.print("| ");
                } else {
                    System.out.printf("%d ", cell);
                    System.out.print("| ");
                }
            }
            System.out.print("\n");
        }
        System.out.println("---------------------");
    }    

    static void zeroMatrix(int[][] matrix) {

        Set<Integer> rowFlags = new HashSet<Integer>();
        Set<Integer> colFlags = new HashSet<Integer>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 0) {
                    rowFlags.add(i);
                    colFlags.add(j);
                }
            }
        }

        // Set entire rows to zero
        for (int r : rowFlags) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[r][i] = 0;
            }
        }

        // Set entire columns to zero
        for (int c : colFlags) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][c] = 0;
            }
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {  {1, 1, 1, 1, 1}, 
                            {1, 1, 1, 1, 1}, 
                            {1, 0, 1, 1, 1}, 
                            {1, 1, 1, 1, 1},
            			    {1, 1, 1, 0, 1}};

        // Before ZeroMatrix
        System.out.println("Before ZeroMatrix: ");
        printMatrix(matrix);

        zeroMatrix(matrix);

        // After ZeroMatrix
        System.out.println("After ZeroMatrix: ");
        printMatrix(matrix);
    }
}
