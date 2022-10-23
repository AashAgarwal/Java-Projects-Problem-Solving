/**
 * Write a program that reads an array of ints and an integer number n. The program must sum all the array elements
 * greater than n.
 *
 * Input data format
 *
 * The first line contains the size of an array.
 * The second line contains the elements of the array separated by spaces.
 * The third line contains the number n.
 *
 * Output data format
 *
 * Only a single number representing the sum.
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
        int num = scanner.nextInt();
        int sum = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > num) {
                sum += array[j];
            }
        }
        System.out.println(sum);
    }
}