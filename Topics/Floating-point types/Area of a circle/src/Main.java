/**
 * Given the radius of a circle, you need to find the area of that circle. Use this formula:
 *
 * S=πR2
 *
 * where S is the area of a circle, π is a Math.PI constant, and R is the radius of the circle.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println(area);
    }
}