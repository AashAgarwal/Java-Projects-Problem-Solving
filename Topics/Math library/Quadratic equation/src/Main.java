/**
 *You are given real numbers a, b and c, where a ≠ 0.
 *
 * Solve the quadratic equation ax2+bx+c=0 and output all of its roots.
 *
 * It is guaranteed that the equation always has two roots.
 *
 * Output the results roots in ascending order. Do not round or format them, the testing system does it automatically.
 */

import java.util.Scanner;

class Main {

    public static void calculateQuadraticRoots(double a, double b, double c) {
        double complex = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        double root1 = (-b + complex) / (2 * a);
        double root2 = (-b - complex) / (2 * a);
        System.out.println(Math.min(root1, root2) + " " + Math.max(root1, root2));
    }

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        calculateQuadraticRoots(a, b, c);
    }
}