/**
 * Write a method with the name sign that takes an int number and checks whether the number is negative, positive or
 * zero. The method should return -1, +1 or 0 respectively.
 */

import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        // write a body here
        int index = -1;
        if (a >= b && a >= c) {
            index = 1;
        } else if (b >= a && b >= c) {
            index = 2;
        } else if (c >= a && c >= b) {
            index = 3;
        }
        return index;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}