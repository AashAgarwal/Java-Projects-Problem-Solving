/**
 * You need to implement the createCube method. It should create a 3x3x3 three-dimensional array with the following
 * content:
 *
 * [0, 1, 2]	[3, 4, 5]	[6, 7, 8]
 * [0, 1, 2]	[3, 4, 5]	[6, 7, 8]
 * [0, 1, 2]	[3, 4, 5]	[6, 7, 8]
 *
 * The elements should be of type int.
 */

class ArrayOperations {
    public static int[][][] createCube() {
        // write your code here
        final int size = 3;
        int[][][] cubeArray = new int[size][size][size];
        int counter = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    cubeArray[i][j][k] = counter;
                    counter++;
                }
            }
            counter = 0;
        }
        return cubeArray;
    }
}