import java.util.Scanner;

/**
 * Upon learning that DNA is not a random string, freshmen of the Bioinformatics Institute from the informatics group
 * suggested using a compression algorithm that compresses repeated characters in a string.
 *
 * Encoding is performed as follows:
 * The string "aaaabbсaa" is converted into "a4b2с1a2", that is, the groups of the same characters of the input string
 * are replaced by the symbol and the number of its repetitions in this string.
 *
 * Write a program, which reads the string, encodes it by this algorithm and outputs the encoded sequence. The encoding
 * must be case-sensitive.
 *
 * Note, string can contain only a single character.
 */

class Main {

    public static String compressionAlgorithm(String str) {
        String str1 = str + " ";
        char[] charArray = str1.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] != charArray[i + 1]) {
                sb.append(charArray[i]);
                sb.append(count);
                count = 1;
            } else {
                count++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(compressionAlgorithm(str));
    }
}