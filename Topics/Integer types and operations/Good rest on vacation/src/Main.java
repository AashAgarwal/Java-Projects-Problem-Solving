/**
 * Write a program that will help people who are going on vacation. The program should calculate the total
 * required sum (e.g. $) of money to have a good rest for a given duration.
 *
 * There are four parameters which have to be considered:
 *
 * duration in days
 * total food cost per day
 * one-way flight cost
 * cost of one night in a hotel (the number of nights equal duration minus one)
 * Read values of these parameters from the standard input and then print the result.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int durationInDays = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int oneWayFlightCost = scanner.nextInt();
        int costOfOneNightInHotel = scanner.nextInt();

        int totalTripCost = foodCostPerDay * durationInDays + oneWayFlightCost * 2 +
                costOfOneNightInHotel * (durationInDays - 1);
        System.out.println(totalTripCost);
    }
}