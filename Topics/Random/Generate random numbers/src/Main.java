/**
 * You are given three numbers: n , a and b.
 *
 * Your task is to output the sum of the first n random numbers in a range from a to b inclusively. The seed of the
 * generator should be set as a + b.
 *
 * The input contains numbers in a single line in the following order: n, a, b.
 */

import java.util.*;

public class Main {

    public static int numberGenerator(int num, int rangeFrom, int rangeTo) {
        int sum = 0;
        Random random = new Random(rangeFrom + rangeTo);
        for (int i = 0; i < num; i++) {
            int temp = random.nextInt(rangeTo - rangeFrom + 1) + rangeFrom;
            sum += temp;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = numberGenerator(n, a, b);
        System.out.println(sum);
    }
}