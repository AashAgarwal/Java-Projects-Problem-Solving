/**
 * Find the indexes of the initial appearance of the maximum element in a matrix.
 *
 * Input data format
 *
 * On the input, the program receives the size of matrix n and m, and then n lines having m integer numbers in each.
 * n and m do not exceed 100.
 *
 * Output data format
 *
 * Output two numbers: the row index and the column index, in which the greatest item in the two-dimensional array
 * (matrix) is located. If there are several such elements, output the one, which has the smaller row index; and if
 * row indexes are the same, output the one having the smaller column index.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] array = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int max = array[0][0];
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    index1 = i;
                    index2 = j;
                }
            }
        }

        System.out.println(index1 + " " + index2);
    }
}