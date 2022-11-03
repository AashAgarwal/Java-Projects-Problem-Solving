/**
 * You are given two 2D vectors. Find the angle (in degrees) between them.
 *
 * If you don't know how to find the angle, see here: http://www.wikihow.com/Find-the-Angle-Between-Two-Vectors.
 *
 * Input data format
 *
 * The first line contains two components of the first vector; the second line contains two components of the second
 * vector. Components in one line are separated by space.
 */

import java.util.Scanner;

class Main {

    public static double calulateAngleBetweenVectors(int real1, int img1, int real2, int img2) {
        double uv = real1 * real2 + img1 * img2;
        double u = Math.sqrt(Math.pow(real1, 2) + Math.pow(img1, 2));
        double v = Math.sqrt(Math.pow(real2, 2) + Math.pow(img2, 2));
        double value = Math.acos(uv / (u * v));
        return Math.toDegrees(value);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int real1 = scanner.nextInt();
        int img1 = scanner.nextInt();
        int real2 = scanner.nextInt();
        int img2 = scanner.nextInt();
        System.out.println(calulateAngleBetweenVectors(real1, img1, real2, img2));
    }
}