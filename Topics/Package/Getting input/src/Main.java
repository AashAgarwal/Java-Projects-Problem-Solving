/**
 * The Scanner class is widely used to parse text to strings, and it is by far the simplest way to get input in Java.
 *
 * In this task, you simply need to implement getString() method of InputReader to read a whole line of input using
 * nextLine() method of Scannerand return it as String. The trick is to use the Scanner class without the import
 * statement.
 *
 * The application will receive a string from the getString() method and output it in the corresponding format.
 */

class InputReader {
    public static String getString() {
        // write your code here
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        return scanner.nextLine();
    }
}