package correcter;

import java.util.Random;
import java.util.Scanner;

/**
 * Stage 1/5: Symbol-level error emulator
 * Description
 * Wireless connections are everywhere around us. But due to interference, the information is distorted.
 * In this project, you implement a simple algorithm capable of correcting such errors.
 *
 * To correct errors, you must first simulate errors. Wireless communication channel will do it for you, but to
 * check the algorithm such emulator will be useful.
 *
 * In this stage, you should write a program that creates errors in the input text, 1 random error per 3 symbols.
 * An error means that the character is replaced by another random character. For example, “abc” characters can
 * be “*bc” or “a*c” or “ab*”, where * is a random character. You can replace it with any character, but it's
 * recommended to use only uppercase and lowercase English letters, spacebar, and numbers.
 *
 * The input contains a single line of the text in which you need to make errors. Only one error per 3 symbols!
 *
 * Stage 2/5: Symbol-level correction code
 * Description
 * Errors are made, but how to correct them?
 *
 * Since we know that the error can be at max every 3 symbols, we can record every symbol 3 times. So, every symbol
 * would be tripled before sending to the internet via a poor connection. Since we have only one error for 3 symbols,
 * in every 3 symbols 2 will necessarily be the same.
 *
 * For example, if the user wants to send this text: "Ab", coded text before sending would be: "AAAbbb", the text after
 * receiving through poor internet connection would be something like "AsAbb2" (as in the previous stage), after
 * decoding we can get "Ab" since the first three symbols contain two A's and the second three symbols contain two b's.
 *
 * In this stage, you should write a program that:
 *
 * Takes a message the user wants it to send. The input contains a single message.
 * Encode the message by tripling all the symbols.
 * Simulate sending this message via a poor internet connection (in other words, simulate errors).
 * Decode it back again.
 * Output the message on every step!
 */

public class Main {

    public static String createErrorPerThreeSymbol(String str) {
        char[] charArray = str.toCharArray();
        Random random = new Random();
        for (int i = 0; i < charArray.length; i += 3) {
            char randomChar = (char) (random.nextInt(122 - 48 + 1) + '0');
            charArray[i] = randomChar;
        }
        return String.copyValueOf(charArray);
    }

    public static String encodeTripleChar(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            sb
                    .append(c)
                    .append(c)
                    .append(c);
        }
        return sb.toString();
    }

    public static String decodedSymbol(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charArray.length - 2; i += 3) {
            if (charArray[i] == charArray[i + 1] || charArray[i] == charArray[i + 2]) {
                sb.append(charArray[i]);
            } else {
                sb.append(charArray[i + 1]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);
        String encodedString = encodeTripleChar(str);
        System.out.println(encodedString);
        String simulatedString = createErrorPerThreeSymbol(encodedString);
        System.out.println(simulatedString);
        String decodedString = decodedSymbol(simulatedString);
        System.out.println(decodedString);
    }
}
