/**
 * Print the sum of all integers from a to b including both.
 *
 * It is guaranteed that a < b in all test cases.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();
        int sum = 0;
        for (int i = index1; i <= index2; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}