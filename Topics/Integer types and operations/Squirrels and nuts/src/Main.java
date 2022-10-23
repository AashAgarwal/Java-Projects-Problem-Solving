/**
 * N squirrels found K nuts and decided to divide them equally. Find how many nuts will be left after each of the
 * squirrels takes the equal amount of nuts.
 *
 * Input data format
 *
 * There are two positive integers N and K, each of them is not greater than 10000.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numberOfSquirrels = scanner.nextInt();
        int totalNumberOfNuts = scanner.nextInt();
        int numberOfNutsLeft = totalNumberOfNuts % numberOfSquirrels;
        System.out.println(numberOfNutsLeft);
    }
}