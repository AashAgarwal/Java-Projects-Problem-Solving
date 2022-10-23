import java.util.Scanner;

/**
 * Write a program that reads an array of integers and an integer. The program must check if the array contains that
 * number.
 *
 * Input data format
 *
 * The first line: the size of an array.
 *
 * The second line: all the elements of the array separated by the space.
 *
 * The third line: one integer.
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
        int num = scanner.nextInt();
        boolean isoContains = false;
        for (int i = 0; i < len; i++) {
            if (array[i] == num) {
                isoContains = true;
                break;
            }
        }
        System.out.println(isoContains);
    }
}