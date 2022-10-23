/**
 * Write a program that reads an array of ints and outputs the maximum product of two adjacent elements in the given
 * array of non-negative numbers.
 *
 * Input data format
 *
 * The first line of the input contains the number of elements in the array.
 *
 * The second line contains the elements of the array separated by spaces.
 *
 * The array always has at least two elements.
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int product = array[0] * array[1];
        for (int i = 0; i < array.length - 2; i++) {
            if (product <= (array[i + 1] * array[i + 2])) {
                product = array[i + 1] * array[i + 2];
            }
        }
        System.out.println(product);
    }
}