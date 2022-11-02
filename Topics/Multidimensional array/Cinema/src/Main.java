/**
 * The cinema has n rows, each row consists of m seats (n and m do not exceed 20). A two-dimensional matrix stores
 * the information on the sold tickets: the number 1 means that the ticket for this place is already sold, and the
 * number 0 means that the place is available. You want to buy k tickets to neighboring seats in the same row.
 * Find whether it can be done.
 *
 * Input data format
 *
 * On the input, the program gets the number of n rows and m seats. Then, there are n lines, each containing m numbers
 * (0 or 1) separated by spaces. The last line contains the number k.
 *
 * Output data format
 *
 * The program should output the number of the row with k consecutive available seats. If there are several rows with
 * k available seats, output the first row with these seats. If there is no such a row, output the number 0.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int seats = scanner.nextInt();
        int[][] cinemaArray = new int[rows][seats];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                cinemaArray[i][j] = scanner.nextInt();
            }
        }

        int kSeatsNeeded = scanner.nextInt();
        int counter = 0;
        int availabilty = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats && availabilty < kSeatsNeeded; j++) {
                if (cinemaArray[i][j] == 0) {
                    counter++;
                    if (counter == kSeatsNeeded) {
                        availabilty = i + 1;
                    }
                } else {
                    counter = 0;
                }
            }
            counter = 0; //resets the counter again in next row
        }
        System.out.println(availabilty);
    }
}