/**
 * Write a program that reads a string and replaces all occurrences of the letter 'a' with the letter 'b'.
 *
 * The program should print out the resulting string.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str = scanner.next();
        String newStr = str.replaceAll("a", "b");
        System.out.print(newStr);
    }
}
