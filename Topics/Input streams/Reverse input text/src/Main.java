/**
 * Read an input text from the console and print its characters in reversed order.
 *
 * Use Reader for collecting characters.
 *
 * In this task, the input is limited by 50 characters. However, you are welcome to find a solution that does not
 * depend on the input size, which may require some extra knowledge
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here
        String str = reader.readLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        reader.close();
    }
}