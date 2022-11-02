/**
 * Given the number n, not exceeding 10, and a matrix of size n × n.
 *
 * Check whether this matrix is symmetric in relation to the main diagonal. Output the word “YES”, if it is symmetric
 * and the word “NO” otherwise.
 *
 * Keep in mind that the main diagonal runs from the top left corner to the bottom right corner.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        boolean symmetry = true;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (array[i][j] != array[j][i]) {
                    symmetry = false;
                    break;
                }
            }
        }

        if (symmetry) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}