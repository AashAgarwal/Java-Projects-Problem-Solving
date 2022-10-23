/**
 * Given a sequence of natural numbers. Read numbers from the input, line by line, and for each number print if it is
 * even or odd; if the number 0 is entered, don't print anything, immediately stop reading further numbers and
 * terminate your program.
 *
 * Input data
 *
 * A sequence of natural numbers, each number in a new line.
 *
 * Output data
 *
 * The sequence of words "even" and "odd". Each word is in a new line.
 *
 * Output the result right after the number is entered. Then input the next one. There's no need to store the sequence.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        while (scanner.hasNext()) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num % 2 == 0 && num != 0) {
                System.out.println("even");
            } else if (num % 2 != 0 && num != 0) {
                System.out.println("odd");
            } else if (num == 0) {
                break;
            }
        }
    }
}