import java.util.Scanner;

/**
 *In the given string find the first longest word and output it.
 *
 * Input data
 *
 * Given a string in a single line. Words in the string are separated by a single space.
 *
 * Output data
 *
 * Output the longest word. If there are several such words, you should output the one, which occurs earlier.
 */

class Main {

    public static void longestWord(String str) {
        String[] strArray = str.split(" ");
        int max = 0;
        int index = 0;
        for (int i = 0; i < strArray.length; i++) {
            if (max < strArray[i].length()) {
                max = strArray[i].length();
                index = i;
            }
        }
        System.out.println(strArray[index]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        longestWord(str);
    }
}