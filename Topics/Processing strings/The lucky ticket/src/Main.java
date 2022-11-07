/**
 * Paul loves to ride public transport and after receiving a ticket, he immediately checks whether he got a lucky one.
 * A ticket is considered a lucky one if the sum of the first three numbers of this ticket matches the sum of the last
 * three numbers.
 *
 * However, Paul does not count well in his head. That is why he asks you to write a program which will check the
 * equality of the sums and display "Lucky" if the sums match, and "Regular" if the sums differ.
 *
 * A string of six digits is provided as input to the program.
 *
 * You need to print out only the word "Lucky" or "Regular" with a capital letter (without quotes).
 */

import java.util.Scanner;

class Main {

    public static void checkLuckyTicket(String str) {
        str.trim();
        String[] strArray = str.split("");
        int leftThree = Integer.parseInt(strArray[0]) + Integer.parseInt(strArray[1]) + Integer.parseInt(strArray[2]);
        int rightThree = Integer.parseInt(strArray[3]) + Integer.parseInt(strArray[4]) + Integer.parseInt(strArray[5]);

        if (leftThree == rightThree) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        checkLuckyTicket(str);
    }
}