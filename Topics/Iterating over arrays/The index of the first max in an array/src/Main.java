import java.util.Scanner;

/**
 * Write a program that reads an array of ints and finds the index of the first maximum in that array.
 *
 * Input data format
 *
 * The first line contains the number of elements in the array.
 *
 * The second line contains the array elements separated by spaces.
 *
 * An array always has at least one element
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
        int index = 0;
        int max = array[0];
        for (int i = 1; i < len; i++) {
            if (max < array[i]) {
                index = i;
                max = array[i];
            }
        }
        System.out.println(index);
    }
}