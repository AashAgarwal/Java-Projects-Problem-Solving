/**
 *In this task, you need to implement reverseElements method. It should reverse all rows of the twoDimArray.
 *
 * It is guaranteed that twoDimArray has at least 1 row.
 *
 * P.S. You don't need to print anything in this task or create a new array: just modify the existing twoDimArray.
 */

class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        // write your code here
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length / 2; j++) {
                int temp = twoDimArray[i][j];
                twoDimArray[i][j] = twoDimArray[i][twoDimArray[i].length - j - 1];
                twoDimArray[i][twoDimArray[i].length - j - 1] = temp;
            }
        }
    }
}