/**
 * Create a euphonious word
 * All the letters of the English alphabet are divided into vowels and consonants.
 * The vowels are: a, e, i, o, u, y.
 * The remaining letters are consonants.
 * <p>
 * A word is considered euphonious (pleasant-sounding) if it doesn't have three or more vowels or consonants in a row.
 * Otherwise, it is considered discordant (harsh-sounding).
 * <p>
 * Your task is to create euphonious words from discordant. You can insert any letters inside the word. You should
 * output the minimum number of characters needed to create a euphonious word from a given word.
 * <p>
 * For example, the word "schedule" is considered discordant because it has three consonants "sch" in a row. To create
 * a euphonious word you need to add any vowel between 's' and 'c' or between 'c' and 'h'.
 */

import java.util.*;

public class Main {

    public static char[] convertVowelsAndConsonants(String str) {
        char[] charArray = str.toLowerCase().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i') {
                charArray[i] = 'V';
            } else if (charArray[i] == 'o' || charArray[i] == 'u' || charArray[i] == 'y') {
                charArray[i] = 'V';
            } else {
                charArray[i] = 'C';
            }
        }
        return charArray;
    }

    public static int euphoniousWord(char[] charArray) {
        int count = 0;
        for (int i = 0; i < charArray.length - 2; i++) {
            if (charArray[i] == 'V' && charArray[i + 1] == 'V' && charArray[i + 2] == 'V') {
                count++;
                i++;
            }
            if (charArray[i] == 'C' && charArray[i + 1] == 'C' && charArray[i + 2] == 'C') {
                count++;
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] charArray = convertVowelsAndConsonants(str);
        System.out.println(euphoniousWord(charArray));
    }
}