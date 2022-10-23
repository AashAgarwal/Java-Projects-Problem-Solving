/**
 * According to the formula, the area of a parallelogram is the result of the multiplication of the base and the height
 * of the figure. Call the method countAreaOfParallelogram that calculates the area of the parallelogram with the
 * following parameters b and h.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // call the method here
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int height = scanner.nextInt();
        countAreaOfParallelogram(base, height);
    }

    // Do not change code below   
    public static void countAreaOfParallelogram(int b, int h) {
        System.out.println(b * h);
    }
}