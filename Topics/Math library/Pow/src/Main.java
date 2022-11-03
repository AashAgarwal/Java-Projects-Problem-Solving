import java.util.Scanner;

/**
 * You are given two floating-point numbers: a and b.
 *
 * Calculate and output the value of the expression ab.
 *
 * Note: use double variables for a and b.
 */

class Main {

    public static double calculatePow(double a, double b) {
        return Math.pow(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println(calculatePow(a, b));
    }
}