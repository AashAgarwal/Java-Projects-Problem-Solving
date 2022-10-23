import java.util.Scanner;

/**
 * Write a program that calculates the sum of the elements of an array of ints.
 *
 * Input data format
 *
 * The first line contains the size of an array.
 *
 * The second line contains elements of the array separated by spaces.
 *
 *
 * Output data format
 *
 * The sum of the input array elements.
 *
 * Note that If your solution gets the code quality warning "System.arraycopy is more efficient",
 * please simply ignore it in respect of this code challenge.
 */

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int sum = 0;
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        System.out.println(sum);
    }
}