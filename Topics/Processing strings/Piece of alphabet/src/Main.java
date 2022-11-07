import java.util.Scanner;

/**
 * Write a program that reads a string and outputs "true" only when the letters of this string form a substring of the
 * ordered English alphabet, for example, "abc", "xy", "pqrst".
 *
 * Otherwise, it should print out "false".
 *
 * Note: string can consist of a single character. Assume an empty string as an alphabet substring.
 */

class Main {

    public static void orderedAlphabet(String str) {
        char[] charArray = str.toCharArray();
        boolean isOrdered = true;
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i + 1] - charArray[i] != 1) {
                isOrdered = false;
            }
        }
        if (isOrdered) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        orderedAlphabet(str);
    }
}