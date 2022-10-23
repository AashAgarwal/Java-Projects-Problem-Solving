/**
 * A user inputs a long positive number m. You need to find out what is the smallest int number n such that n! > m.
 *
 * n!, or factorial n, is a product of all natural numbers from 1 to n inclusive: for example, 5! = 1 * 2 * 3 * 4 * 5.
 *
 * Just in case: wiki on factorials.
 *
 * For example, the user enters 100. This means m = 100 and n = 5 because 5! = 120 (see the factorial formula) and
 * this is the smallest number that satisfies the condition n! > m.
 *
 * Pay attention that the user may input a really big number so choose an appropriate data type!
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        long input = scanner.nextLong();
        long num = 1;
        long product = 1;
        while (product <= input) {
            num++;
            product = product * num;
        }
        System.out.println(num);
    }
}