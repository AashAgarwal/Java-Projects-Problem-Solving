/**
 * Find how many seconds passed between the two moments of time on the same day.
 *
 * You are given the integer values representing these moments: hours, minutes and seconds for each of them.
 * It is guaranteed that the earlier moment goes first in the input.
 *
 * Input data format
 *
 * The program gets the input of six integers: three defining the first moment of time in hours, minutes, seconds,
 * and the other three defining the second one.
 *
 * For example, six numbers 1, 2, 30, 15, 21, 1 will represent two moments of time: 1:02:30 am and
 * 3:21:01 pm (or just 15:21:01).
 *
 * Output data format
 *
 * Just one number: seconds between these two moments of time. It's 51511 (14 hours, 18 minutes and 31 seconds)
 * in our example.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int value1Hours = scanner.nextInt();
        int value1Minutes = scanner.nextInt();
        int value1Seconds = scanner.nextInt();
        int value2Hours = scanner.nextInt();
        int value2Minutes = scanner.nextInt();
        int value2Seconds = scanner.nextInt();
        final int hoursToSeconds = 3600;
        final int minuteToSeconds = 60;
        int differenceInSeconds = value2Hours * hoursToSeconds + value2Minutes * minuteToSeconds + value2Seconds -
                (value1Hours * hoursToSeconds + value1Minutes * minuteToSeconds + value1Seconds);
        System.out.println(differenceInSeconds);
    }
}