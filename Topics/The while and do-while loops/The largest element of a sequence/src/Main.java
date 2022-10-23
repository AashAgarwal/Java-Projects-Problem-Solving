/**
 * Given a sequence of positive integer numbers (which ends with the number 0). Find the largest element of the sequence
 *
 * The number 0 itself is not included in the sequence but serves only as a sign of the sequence’s end.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = scanner.nextInt();
        int max = num;
        while (scanner.hasNext() && num != 0) {
            if (num > max) {
                max = num;
            }
            num = scanner.nextInt();
        }
        System.out.println(max);
    }
}