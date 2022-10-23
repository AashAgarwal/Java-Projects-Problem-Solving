import java.util.Scanner;

/**
 * Write a program that reads an array of ints and an integer number n.
 *
 * The program must check how many times n occurs in the array.
 *
 * Input data format
 * The first line contains the size of the input array.
 *
 * The second line contains elements of the array separated by spaces.
 *
 * The third line contains n.
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
        int num = scanner.nextInt();
        int count = 0;
        for (int j = 0; j < len; j++) {
            if (array[j] == num) {
                count++;
            }
        }
        System.out.println(count);
    }
}