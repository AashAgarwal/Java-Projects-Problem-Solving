/**
 * Your friends asked for your help in solving a coding problem. They were trying to create a utility method for
 * swapping two integer numbers, but something went wrong and the method does not work as expected. Use your debugging
 * skills to fix the problem.
 */

import java.util.Scanner;

class Util {
    public static void swapInts(int[] ints) {
        System.out.println(ints[1]);
        System.out.println(ints[0]);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ints = new int[2];
        ints[0] = Integer.parseInt(scanner.nextLine());
        ints[1] = Integer.parseInt(scanner.nextLine());

        Util.swapInts(ints);
    }
}