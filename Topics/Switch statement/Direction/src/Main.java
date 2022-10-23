/**
 * Write a program, which reads the number of direction (1 – up, 2 – down, 3 – left, 4 – right, 0 – do not move) and
 * outputs the text "move up" (or "move down", or "move left", or "move right", or "do not move" depending on the
 * entered number). If it is a number that does not belong to any of the listed directions, the program should output
 * "error!"
 *
 * Note: the output text should exactly match the sample, including the letters’ case and location of spaces.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("move up");
                break;
            case 2:
                System.out.println("move down");
                break;
            case 3:
                System.out.println("move left");
                break;
            case 4:
                System.out.println("move right");
                break;
            case 0:
                System.out.println("do not move");
                break;
            default:
                System.out.println("error!");
                break;
        }
    }
}