/**
 * You need to implement printTheThirdRow method. It should print the third row of the twoDimArray.
 * The elements should be separated by space.
 *
 * It is guaranteed that twoDimArray has at least 3 rows.
 */

class ArrayOperations {
    public static void printTheThirdRow(int[][] twoDimArray) {
        // write your code here

        for (int j = 0; j < twoDimArray[2].length; j++) {
            System.out.print(twoDimArray[2][j] + " ");
        }
    }
}