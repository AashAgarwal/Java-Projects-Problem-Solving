/**
 * Write a program that reads four double values a, b, c, d and then evaluates the following expression
 *
 * a * 10.5 + b * 4.4 + (c + d) / 2.2
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double result = a * 10.5 + b * 4.4 + (c + d) / 2.2;
        System.out.println(result);
    }
}