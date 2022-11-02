/**
 * Given the number n, not greater than 100, create a matrix of size n×n and fill it using the following rule.
 * Numbers 0 should be stored on the primary (main) diagonal. The two diagonals, adjacent to the primary one, should
 * contain numbers 1. The next two diagonals should contain numbers 2; etc.
 *
 * Note: the primary diagonal runs from the top left corner to the bottom right corner.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] array = new int[size][size];

        int value = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    value = 0;
                    array[i][j] = value;
                } else {
                    value++;
                    array[i][j] = value;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[j][i] = array[i][j];
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}