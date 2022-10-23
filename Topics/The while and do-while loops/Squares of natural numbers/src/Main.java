/**
 * Read an integer number N from the input and print all the squares of positive integers:
 *
 * less than or equal to N,
 * in ascending order.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int input = scanner.nextInt();
        int num = 1;
        while (num * num <= input) {
            System.out.println(num * num);
            num++;
        }
    }
}