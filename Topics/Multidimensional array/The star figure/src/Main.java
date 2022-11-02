/**
 * Your task is to draw a star on the n×n field using the symbols . and *. n is odd and doesn't exceed 15.
 *
 * To do this, you can follow the instructions:
 *
 * Firstly, you need to create a two-dimensional array (matrix) from n×n elements by filling it with the . symbols.
 * Each element of the matrix is a string containing a single symbol.
 * Secondly, fill the middle row of the matrix, the middle column, and the diagonals with the * symbols. As a result,
 * all *'s in the array must form the star figure.
 * Thirdly, output this matrix; elements of the array should be space-separated.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        String[][] array = new String[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i == size / 2 || j == size / 2) {
                    array[i][j] = "*";
                } else {
                    array[i][j] = ".";
                }
            }
        }

        int temp = size - 1;

        for (int i = 0; i < size; i++) {
            for (int j = temp; ;) {
                array[i][j] = "*";
                break;
            }
            temp--;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}