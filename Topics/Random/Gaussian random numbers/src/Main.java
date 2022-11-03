/**
 * For the given numbers K, N, and M find the first seed that is greater than or equal to K where each of N Gaussian
 * numbers is less than or equal to M.
 *
 * The input contains numbers K, N, M in a single line.
 *
 * You should output the seed.
 */

import java.util.*;

public class Main {

    public static long findSeed(long k, int n, double m) {
        boolean flag = true;
        long seed = 0L;
        boolean found = false;

        for (long i = k; i >= k && !found; i++) {
            Random random = new Random(i);
            for (int j = 1; j <= n; j++) {
                double temp = random.nextGaussian();
                if (temp > m) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                seed = i;
                found = true;
            }
        }
        return seed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long k = scanner.nextLong();
        int n = scanner.nextInt();
        double m = scanner.nextDouble();
        long seed = findSeed(k, n, m);
        System.out.println(seed);
    }
}