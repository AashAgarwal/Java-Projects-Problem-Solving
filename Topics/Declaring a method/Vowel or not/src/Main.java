/**
 * Implement a method that checks whether a given English letter is a vowel or not. The input may be in any case.
 *
 * In our case, the letter 'y' is not considered a vowel.
 *
 * Examples:
 *
 * isVowel('a') should be true
 * isVowel('A') should be true
 * isVowel('b') should be false
 */

import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        // write your code here
        boolean vowel = false;
        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E'
                || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                || ch == 'u' || ch == 'U') {
            vowel = true;
        }
        return vowel;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}