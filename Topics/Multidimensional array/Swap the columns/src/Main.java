/**
 * Given a two-dimensional array (matrix) and the two numbers: i and j. Swap the columns with indexes i and j within
 * the matrix.
 *
 * Input contains matrix dimensions n and m, not exceeding 100, then the elements of the matrix, then the indexes
 * i and j.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] twoDimArray = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                twoDimArray[i][j] = scanner.nextInt();
            }
        }

        int indexI = scanner.nextInt();
        int indexJ = scanner.nextInt();

        for (int i = 0; i < row; i++) {
            int temp = twoDimArray[i][indexI];
            twoDimArray[i][indexI] = twoDimArray[i][indexJ];
            twoDimArray[i][indexJ] = temp;
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}