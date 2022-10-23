/**
 * Find the sum of all elements of a sequence, ending with the number 0.
 *
 * The number 0 itself is not included into the sequence and serves as a sign of cessation.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = scanner.nextInt();
        int sum = 0;
        while (scanner.hasNext() && num != 0) {
            sum += num;
            num = scanner.nextInt();
        }
        System.out.println(sum);
    }
}