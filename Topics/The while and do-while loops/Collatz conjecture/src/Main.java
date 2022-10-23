/**
 * Given natural number n not exceeding 1_000_000, generate a sequence of integers, described in the Collatz conjecture:
 *
 * If n is an even number, divide it in half; if it is odd, multiply it by 3 and add 1. Repeat this operation until we
 * get the number 1 as a result.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        long num = scanner.nextLong();
        System.out.print(num + " ");
        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
                System.out.print(num + " ");
            } else {
                num = num * 3 + 1;
                System.out.print(num + " ");
            }
        }
    }
}