// 2022-09-24
/* 
* The most difficult part for me is to iterate the matrix in rotation
* I managed to rotate the pointers this way 
* | x-- | -x- | --x | --- | --- | --- | --- | --- |
* | --- | --- | --- | --x | --- | --- | --- | x-- |
* | --- | --- | --- | --- | --x | -x- | x-- | --- |
* But I want to rotate them this way instead (can't!)
* | x-- | --x | --- | --- | -x- | --- | --- | --- |
* | --- | --- | --- | --- | --- | --x | --- | x-- |
* | --- | --- | --x | x-- | --- | --- | -x- | --- |
*/ 

public class RotateMatrix {

    static void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            System.out.println("---------------------");
            System.out.print("| ");
            for (int cell : row) {
                if (cell < 10) {
                    System.out.printf("0" + "%d ", cell);
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

    static void rotateMatrix(int[][] matrix) {

        int layers = matrix.length / 2;

        // Iterate layers
        for (int i = 0; i < layers; i++) {
            int x = i;
            int y = i;
            int _x = i;
            int _y = i + (matrix.length-1-2*i); 

            // Create temporary array filled with first side
            int[] tmp = new int[matrix.length-1-2*i];
            for (int f = 0; f < matrix.length-1-2*i; f++) {
                tmp[f] = matrix[x][y+f];
            }

            int[] tmp2 = new int[matrix.length-1-2*i];
 
            // Iterate sides
            for (int j = 0; j < 4; j++) {
                // Iterate elements of each side
                for (int k = 0; k < matrix.length-1-2*i; k++) {
                    // System.out.printf("%d to %d\n", matrix[x][y], matrix[_x][_y]);

                    if (j==0) {
                        // Store next side on temporary array
                        tmp[k] = matrix[_x][_y];
                        // Overwrite next side with current side
                        matrix[_x][_y] = matrix[x][y];
                    }
                    
                    if (j>0) {
                        // Store next side on tmp array 2
                        tmp2[k] = matrix[_x][_y];
                        // Overwrite next side with tmp array 1
                        matrix[_x][_y] = tmp[k];
                        // Overwrite tmp array 1 with tmp array 2
                        tmp[k] = tmp2[k];
                    }

                    // Updates matrix pointers
                    if (j == 0) {y++; _x++;}
                    if (j == 1) {x++; _y--;}
                    if (j == 2) {y--; _x--;}
                    if (j == 3) {x--; _y++;}
                }
            }
        }

    }

    public static void main(String[] args) {

        int[][] matrix = {  { 1, 2, 3, 4}, 
                            { 5, 6, 7, 8}, 
                            { 9,10,11,12}, 
                            {13,14,15,16}};

        // Before rotation
        System.out.println("Before rotation: ");
        printMatrix(matrix);

        rotateMatrix(matrix);

        // After rotation
        System.out.println("After rotation: ");
        printMatrix(matrix);
    }
}