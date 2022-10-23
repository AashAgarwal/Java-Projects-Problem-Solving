/**
 * Write a program that prints the product of all integer numbers from a to b ( a < b).
 * Include a and exclude b from the product.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int lowerLimit = scanner.nextInt();
        int upperLimit = scanner.nextInt();
        long product = 1;
        for (int i = lowerLimit; i < upperLimit; i++) {
            product = product * i;
        }
        System.out.println(product);
    }
}