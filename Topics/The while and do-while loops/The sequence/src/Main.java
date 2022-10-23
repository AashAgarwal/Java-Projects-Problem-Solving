/**
 * You are given a sequence of natural numbers, not exceeding 30000. Find the maximum element divisible by 4.
 * As input, the program gets the number of elements in the sequence, and then the elements themselves.
 * In the sequence, there is always an element divisible by 4. The number of elements does not exceed 1000.
 * The program should print a single number: the maximum element of the sequence divisible by 4.
 *
 * Try to solve this problem by using a while-loop.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = scanner.nextInt();
        int max = 0;
        while (scanner.hasNext()) {
            num = scanner.nextInt();
            if (num % 4 == 0 && num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}