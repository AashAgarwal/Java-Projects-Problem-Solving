import java.util.Scanner;

/**
 * Write a program that finds the frequency of occurrences of a substring in a given string. Substrings cannot overlap:
 * for example, the string ababa contains only one substring aba.
 */

class Main {

    public static void numberOfOccurrences(String str, String substring) {
        String[] splitArray = str.split(substring, -1);
        System.out.println(splitArray.length - 1);
    }

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String subString = scanner.nextLine();
        numberOfOccurrences(str, subString);
    }
}