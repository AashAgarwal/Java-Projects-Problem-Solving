import java.util.Scanner;

/**
 * Write a program that reads an array of int's and checks if the array is sorted ascending (from smallest to largest
 * number).
 *
 * Input data format
 *
 * The first line contains the size of an array.
 * The second line contains elements of the array separated by spaces.
 */

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        boolean isSortedAscending = true;
        for (int i = 0; i < len - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSortedAscending = false;
                break;
            }
        }
        System.out.println(isSortedAscending);
    }
}