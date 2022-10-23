/**
 * Write a program that reads a three-digit number, calculates the new number by reversing its digits,
 * and outputs a new number.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();

        int hundredthPlace = num / 100;
        int tenthPlace = (num / 10) % 10;
        int onesPlace = num % 10;

        int reverseNumber = onesPlace * 100 + tenthPlace * 10 + hundredthPlace;
        System.out.println(reverseNumber);
    }
}