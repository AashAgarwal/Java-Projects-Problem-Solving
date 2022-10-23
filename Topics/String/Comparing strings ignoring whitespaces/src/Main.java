/**
 * Write a program that reads two lines and compares them without whitespaces.
 * The program should print true if both lines are equal, otherwise – false.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str1 = scanner.nextLine().replaceAll(" ", "");
        String str2 = scanner.nextLine().replaceAll(" ", "");
        if (str1.equals(str2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}