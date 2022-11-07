/**
 * Read an input text from the console and print the number of words. By word we mean a sequence of characters
 * separated by one or several spaces.
 *
 * If the input is empty or there are no characters except spaces, print 0.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here
        String str = reader.readLine().trim();
        if (str.length() == 0) {
            System.out.println(0);
        } else {
            String[] strArray = str.split("\\s+");
            System.out.println(strArray.length);
        }
        reader.close();
    }
}