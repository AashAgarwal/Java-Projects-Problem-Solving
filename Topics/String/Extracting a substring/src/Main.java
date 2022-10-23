/**
 * Write a program that reads a string and two integer numbers.
 * These two numbers are representing a range that includes them both.
 * Print the substring enclosed in this range.
 * Both numbers are always greater than or equal to 0 and less than the string length.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str = scanner.nextLine();
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();
        String newStr = str.substring(index1, index2 + 1);
        System.out.println(newStr);
    }
}