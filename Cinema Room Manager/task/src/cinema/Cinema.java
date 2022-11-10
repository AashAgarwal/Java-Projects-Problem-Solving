package cinema;

import java.util.Arrays;
import java.util.Scanner;

public class Cinema {

    public static String[][] cinemaLayout(int rows, int seatsInEachRow) {
        String[][] cinemaSeats = new String[rows + 1][seatsInEachRow + 1];
        for (String[] seat : cinemaSeats) {
            Arrays.fill(seat, "S");
        }
        cinemaSeats[0][0] = cinemaSeats[0][0].replace("S", " ");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < cinemaSeats[i].length; j++) {
                cinemaSeats[i][j] = cinemaSeats[i][j].replace("S", String.valueOf(j));
            }
        }
        for (int i = 0; i < cinemaSeats.length; i++) {
            for (int j = 0; j < 1; j++) {
                cinemaSeats[i][j] = cinemaSeats[i][j].replace("S", String.valueOf(i));
            }
        }
        return cinemaSeats;
    }

    public static void printCinemaLayout(String[][] cinemaSeats) {
        System.out.println("Cinema:");
        for (String[] cinemaSeat : cinemaSeats) {
            for (String s : cinemaSeat) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

    public static int calculateTicketStatistics(int rows, int seatsInEachRow, int desiredRow, int[] ticketStats,
                                          boolean statistics) {
        int ticketPrice;
        int totalIncome;
        if (rows * seatsInEachRow > 60) {
            int totalSeatsInFirstHalf = rows / 2 * seatsInEachRow;
            int totalSeatsInSecondHalf = rows * seatsInEachRow - totalSeatsInFirstHalf;
            totalIncome = totalSeatsInFirstHalf * 10 + totalSeatsInSecondHalf * 8;
            if (desiredRow <= rows / 2) {
                ticketPrice = 10;
            } else {
                ticketPrice = 8;
            }
        } else {
            ticketPrice = 10;
            totalIncome = rows * seatsInEachRow * 10;
        }
        if (statistics) {
            System.out.println("Number of purchased tickets: " + ticketStats[0]);
            double percentage = (double) ticketStats[0] / (rows * seatsInEachRow) * 100;
            System.out.printf("Percentage: %.02f", percentage);
            System.out.println("%");
            System.out.println("Current income: $" + ticketStats[1]);
            System.out.println("Total income: $" + totalIncome);
        }
        return ticketPrice;
    }

    public static void purchaseTicket(String[][] cinemaSeats, int rows, int seatsInEachRow,
                                      int[] ticketStats) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a row number:");
        int desiredRow = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int desiredSeatInThatRow = scanner.nextInt();
        if (desiredRow > rows || desiredSeatInThatRow > seatsInEachRow) {
            System.out.println("Wrong input!");
            purchaseTicket(cinemaSeats, rows, seatsInEachRow, ticketStats);
        } else if ("B".equals(cinemaSeats[desiredRow][desiredSeatInThatRow])) {
            System.out.println("That ticket has already been purchased!");
            purchaseTicket(cinemaSeats, rows, seatsInEachRow, ticketStats);
        } else {
            int ticketPrice = calculateTicketStatistics(rows, seatsInEachRow, desiredRow, ticketStats, false);
            System.out.println("Ticket price: $" + ticketPrice);
            cinemaSeats[desiredRow][desiredSeatInThatRow] = cinemaSeats[desiredRow][desiredSeatInThatRow]
                    .replace("S", "B");
            ticketStats[0]++;
            ticketStats[1] += ticketPrice;
        }
    }

    public static void action(int rows, int seatsInEachRow) {
        Scanner scanner = new Scanner(System.in);
        int[] ticketStats = new int[2];
        Arrays.fill(ticketStats, 0);
        String[][] cinemaSeats = cinemaLayout(rows, seatsInEachRow);
        System.out.println("1. Show the seats \n2. Buy a ticket \n3. Statistics \n0. Exit \n");
        int input = scanner.nextInt();
        while (input != 0) {
            switch (input) {
                case 1 -> printCinemaLayout(cinemaSeats);
                case 2 -> purchaseTicket(cinemaSeats, rows, seatsInEachRow, ticketStats);
                case 3 -> calculateTicketStatistics(rows, seatsInEachRow, 0, ticketStats, true);
                default -> System.out.println("Invalid selection");
            }
            System.out.println("\n1. Show the seats \n2. Buy a ticket \n3. Statistics \n0. Exit \n");
            input = scanner.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seatsInEachRow = scanner.nextInt();
        action(rows, seatsInEachRow);
    }
}