/**
 * Write a program that reads an array of integers and finds the minimum value of the array.
 *
 * Input data format
 *
 * The first line contains the size of an array.
 * The second line contains elements of the array separated by spaces.
 *
 * Output data format
 *
 * An integer number representing the minimum in the input array.
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
        int min = array[0];
        for (int j = 1; j < array.length; j++) {
            if (min > array[j]) {
                min = array[j];
            }
        }
        System.out.println(min);
    }
}