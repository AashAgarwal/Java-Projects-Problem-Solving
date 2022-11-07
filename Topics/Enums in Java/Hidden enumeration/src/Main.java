/**
 * You are given a hidden enum named Secret with some constants in uppercase.
 *
 * Write a program that counts and prints how many constants in the enumeration start with "STAR". The enum is
 * accessible during testing.
 *
 * The small enum for tests:
 *
 * // At least two constants start with STAR
 * enum Secret {
 *     STAR, CRASH, START, // ...
 * }
 * You can uncomment the commented enum and use it as a sample for writing the program. Do not forget you must comment
 * it back before submitting your solution!
 *
 * Note that at least two constants start with STAR.
 */

public class Main {

    public static void main(String[] args) {
        int counter = 0;

        // write your code here
        Secret[] secret = Secret.values();

        for (Secret value : secret) {
            if (value.toString().startsWith("STAR")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}

// sample enum for inspiration
enum Secret {
    STAR, CRASH, START, // ...
}