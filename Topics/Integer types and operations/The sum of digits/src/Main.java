/**
 * Given a three-digit integer (i.e. an integer from 100 to 999). Find the sum of its digits.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();
        int sum = num / 100 + ((num / 10) % 10) + (num % 10);
        System.out.println(sum);
    }
}