public class RotateMatrix {

    

    public static void main(String[] args) {

        int[][] matrix = {  { 1, 2, 3, 4}, 
                            { 5, 6, 7, 8}, 
                            { 9,10,11,12}, 
                            {13,14,15,16}};

        int origin = 0;
        int layers = matrix.length / 2;

        // Iterate layers
        for (int i = 0; i < layers; i++) {
            int x = i;
            int y = i;
            int _x = i;
            int _y = i + (matrix.length-1-2*i); 

            // int side = matrix.length - 2*origin;

            // Iterate sides
            for (int j = 0; j < 4; j++) {
                // Iterate elements of each side
                for (int k = 0; k < matrix.length-1-2*origin; k++) {
                    // ... actions!!
                    System.out.printf("%d to %d\n", matrix[x][y], matrix[_x][_y]);
                    if (j == 0) {y++; _x++;}
                    if (j == 1) {x++; _y--;}
                    if (j == 2) {y--; _x--;}
                    if (j == 3) {x--; _y++;}
                }
            }
            origin++;
        }
    }
}