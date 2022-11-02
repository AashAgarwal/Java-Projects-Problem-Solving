import java.util.Scanner;

/**
 * Given a rectangle array n×m in size. Rotate it by 90 degrees clockwise, by recording the result into the new array
 * m×n in size.
 *
 * Input data format
 *
 * Input consists of the two numbers n and m, not exceeding 100, and then an array n×m in size.
 */

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

        int[][] rotatedArray = new int[column][row];

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                rotatedArray[i][j] = array[row - j - 1][i];
            }
        }

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(rotatedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}