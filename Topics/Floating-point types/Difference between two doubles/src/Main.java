/**
 * Write a program that reads two double values and prints the difference between the second and the first one.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        System.out.println(second - first);
    }
}