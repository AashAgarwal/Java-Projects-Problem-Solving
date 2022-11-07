/**
 * Implement a method to concatenate all strings from the given array to a single long string. You must skip all digits
 * inside the input strings.
 *
 * Use StringBuilder to solve the problem, because the input array can contain a huge number of strings.
 */

import java.util.Scanner;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        // write your code with StringBuilder here
        StringBuilder sb = new StringBuilder();
        for (String string : strings) {
            sb.append(string);
        }
        return sb.toString().replaceAll("\\d", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}