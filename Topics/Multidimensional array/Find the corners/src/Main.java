/**
 * You need to implement printCorners method. It should print all corner elements of the twoDimArray in the following
 * order: left to right and top to bottom.
 *
 * The elements must be separated by space and printed as an example below.
 */

class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        // write your code here

        int corner1 = twoDimArray[0][0];
        int corner2 = twoDimArray[0][twoDimArray[0].length - 1];
        int corner3 = twoDimArray[twoDimArray.length - 1][0];
        int corner4 = twoDimArray[twoDimArray.length - 1][twoDimArray[0].length - 1];

        System.out.println(corner1 + " " + corner2);
        System.out.println(corner3 + " " + corner4);
    }
}