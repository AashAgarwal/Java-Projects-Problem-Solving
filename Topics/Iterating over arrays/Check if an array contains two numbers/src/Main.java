import java.util.Scanner;

/**
 * Write a program that reads an unsorted array of integers and two numbers n and m. The program must check if n and m
 * occur next to each other in the array (in any order).
 *
 * Input data format
 *
 * The first line contains the size of an array.
 * The second line contains elements of the array.
 * The third line contains two integer numbers n and m.
 * All numbers in the same line are separated by the space character.
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
        boolean isOccur = false;
        for (int i = 0; i < len - 1; i++) {
            if (array[i] == num1 && array[i + 1] == num2 || array[i] == num2 && array[i + 1] == num1) {
                isOccur = true;
                break;
            }
        }
        System.out.println(isOccur);
    }
}