/**
 * There is a method print(String arg). The method outputs the name and its argument (in " ", as it's a string).
 * The output format for the string argument "test" is:
 *
 * print("test")
 * Overload this method by writing a new method with the same name and two arguments: a string and an integer.
 * The new method should print the name and both parameters, like this:
 *
 * print("test", 4)
 * Do not remove the existing method!
 */

import java.util.Scanner;

public class Main {

    public static void print(String strArg) {
        System.out.println("print(\"" + strArg + "\")");
    }

    // write your method here
    public static void print(String strArg, int num) {
        System.out.printf("print(\"" + strArg + "\", %d)", num);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int val = scanner.nextInt();
        print(str);
        print(str, val);
    }
}