/**
 * Take a look at the program that reads a string and a number N and outputs the Nth element of a string
 * (starting from 0).
 *
 * This program may throw StringIndexOutOfBoundsException. Fix it to avoid the exception.
 */

import java.util.*;

class FixingStringIndexOutOfBoundsException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int index = scanner.nextInt();
        if (index < 0 || index > string.length() - 1) {
            System.out.println("Out of bounds!");
        } else {
            System.out.println(string.charAt(index));
        }
    }
}