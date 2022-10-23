/**
 * Snail creeps up a vertical pole of height H feet. It goes A feet up per day, and B feet down per night.
 * On which day will the snail reach the top of the pole?
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int heightOfPole = scanner.nextInt();
        int heightSnailGoesUp = scanner.nextInt();
        int heightSnailClimbsDown = scanner.nextInt();
        int numberOfDays = 1 + (heightOfPole - heightSnailClimbsDown - 1) / (heightSnailGoesUp - heightSnailClimbsDown);
        System.out.println(numberOfDays);
    }
}