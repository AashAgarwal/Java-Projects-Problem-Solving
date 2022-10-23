/**
 * Write a program that checks if a given string starts with the prefix "J" ignoring the case.
 *
 * The program should output true or false.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str = scanner.nextLine();
        if (str.startsWith("J") || str.startsWith("j")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}