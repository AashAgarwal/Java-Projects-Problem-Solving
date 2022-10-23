/**
 * For its input, the program gets a sequence of non-negative integers; each integer is written in a separate line.
 * The sequence ends with an integer 0; when the program reads 0, it should end its work and output the length of the
 * sequence (not counting the final 0).
 *
 * Don’t read numbers following the number 0.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = scanner.nextInt();
        int count = 0;
        while (scanner.hasNext() && num != 0) {
            num = scanner.nextInt();
            count++;
        }
        System.out.println(count);
    }
}