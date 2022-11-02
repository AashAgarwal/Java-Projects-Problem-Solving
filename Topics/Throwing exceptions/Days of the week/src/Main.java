/**
 * Your task is to implement the getDayOfWeekName method that converts the number of the day of the week to its short
 * name. If the given number is incorrect, the method should throw an IllegalArgumentException.
 *
 * Let's assume that a week starts from Monday:
 *
 * 1 → "Mon";
 * 2 → "Tue";
 * 3 → "Wed";
 * 4 → "Thu";
 * 5 → "Fri";
 * 6 → "Sat";
 * 7 → "Sun".
 */

import java.util.*;

public class Main {

    public static String getDayOfWeekName(int number) {
        // write your code here
        switch (number) {
            case 1: return "Mon";
            case 2: return "Tue";
            case 3: return "Wed";
            case 4: return "Thu";
            case 5: return "Fri";
            case 6: return "Sat";
            case 7: return "Sun";
            default: throw new IllegalArgumentException("java.lang.IllegalArgumentException");
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        try {
            System.out.println(getDayOfWeekName(dayNumber));
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }
}