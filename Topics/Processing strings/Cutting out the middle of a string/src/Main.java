/**
 * Write a program that reads a string, and then outputs the string without its middle character when the length is odd,
 * and without the middle 2 characters when the length is even.
 */

import java.util.Scanner;

class Main {

    public static void removeMiddleChar(String str) {
        if (str.length() % 2 == 0) {
            System.out.print(str.substring(0, str.length() / 2 - 1) + str.substring(str.length() / 2 + 1));
        } else {
            System.out.print(str.substring(0, str.length() / 2) + str.substring(str.length() / 2 + 1));
        }
    }

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        removeMiddleChar(str);
    }
}