import java.util.Scanner;

/**
 * Write a program that reads an array of integers and two numbers n and m. The program must check that n and m never
 * occur next to each other (in any order) in the array.
 *
 * Input data format
 *
 * The first line contains the size of an array.
 *
 * The second line contains elements of the array.
 *
 * The third line contains two integer numbers n and m.
 *
 * All numbers in the same line are separated by the space character.
 *
 * Output data format
 *
 * The result is a single boolean value true if n and m never occur next to each other; otherwise, it is false.
 */

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        boolean isNever = true;
        for (int j = 0; j < len - 1; j++) {
            if (array[j] == num1 && array[j + 1] == num2 || array[j] == num2 && array[j + 1] == num1) {
                isNever = false;
                break;
            }
        }
        System.out.println(isNever);
    }
}