/**
 * Given an integer as an input, print True if its value falls within the interval (−15,12]∪(14,17)∪[19,+∞).
 * Otherwise, print False (case sensitive).
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = scanner.nextInt();
        if ((num >-15 && num <= 12) || (num > 14 && num < 17) || (num >= 19)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}