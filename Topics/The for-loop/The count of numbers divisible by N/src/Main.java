/**
 * Write a program that reads three positive integers a, b, n and outputs the count of numbers divisible by n in the
 * range from a to b (a < b) inclusively.
 *
 * Note: it is possible to write this program more efficiently without any loops.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int divisor = scanner.nextInt();
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i % divisor == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}