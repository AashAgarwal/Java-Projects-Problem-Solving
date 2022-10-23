/**
 * Write a method with the name sign that takes an int number and checks whether the number is negative, positive or
 * zero. The method should return -1, +1 or 0 respectively.
 */

import java.util.Scanner;

public class Main {

    public static int sign(int number) {
        // write your code here
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}