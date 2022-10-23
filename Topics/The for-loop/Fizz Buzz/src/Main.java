/**
 * Fizz Buzz is a classic programming problem. Here is its slightly modified version.
 *
 * Write a program that takes two integers as the input: the beginning and the end of the interval
 * (both numbers belong to the interval).
 *
 * The program should output the numbers from this interval, but if the number is divisible by 3, you should output
 * Fizz instead of it; if the number is divisible by 5, output Buzz;
 * and if it is divisible both by 3 and by 5, output FizzBuzz.
 *
 * Output each number or the word on a separate line.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}