/**
 * Write a program which reads a double value x and evaluates the result of x3+x2+x+1
 *
 * Output data format
 *
 * The double result of the expression.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double number = scanner.nextDouble();
        double sum = number * number * number + number * number + number + 1;
        System.out.println(sum);
    }
}