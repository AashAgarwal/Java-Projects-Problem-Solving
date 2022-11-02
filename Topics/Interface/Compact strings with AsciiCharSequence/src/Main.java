/**
 * Strings in Java implement java.lang.CharSequence interface. Since Java internally uses UTF-16, 2 bytes are required
 * to store each char. At the same time, ASCII encoding allows storing character codes in one byte and includes all
 * Latin letters, digits, and standard special characters. Compared to the standard String class, ASCII-character
 * sequences require half the memory.
 *
 * Write a class named AsciiCharSequence for storing ASCII-character sequences, that should:
 *
 * implement the interface java.lang.CharSequence;
 * have a constructor that takes a byte array;
 * have methods int length(), char charAt(int idx), CharSequence subSequence(int from, int to), and String toString().
 * You can find the declaration of methods and their behavior in the description of java.lang.CharSequence
 * (JavaDoc or sources).
 *
 * Carefully check signatures of abstract methods of java.lang.CharSequence interface, especially subSequence method.
 * It accepts 2 integers: start index (inclusive) and end index (exclusive). The method returns an object of a class
 * that implements java.lang.CharSequence interface. In this example it will be an instance of AsciiCharSequence class.
 *
 * Note: the testing system will always pass correct input parameters to overridden methods.
 */

import java.nio.charset.StandardCharsets;
import java.util.*;

class AsciiCharSequence implements CharSequence {

    //implementation
    byte[] array;

    public AsciiCharSequence(byte[] array) {
        this.array = array.clone();
    }

    @Override
    public int length() {
        return array.length;
    }

    @Override
    public char charAt(int idx) {
        return (char) array[idx];
    }

    @Override
    public CharSequence subSequence(int from, int to) {
        return new AsciiCharSequence(Arrays.copyOfRange(array, from, to));
    }

    @Override
    public String toString() {
        return new String(array, StandardCharsets.UTF_8);
    }
}