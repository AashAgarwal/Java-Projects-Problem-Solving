/**
 *Write a method that calculates the factorial of a given number.
 *
 * The factorial of n is calculated by the product of integer number from 1 to n (inclusive). The factorial of 0 is
 * equal to 1.
 */

import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        // write your code here
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}