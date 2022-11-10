/**
 * Implement a method for converting a Long value to int (primitive type) according to the following rules:
 *
 * if the given value is null the method should return the default value for ints;
 * if the given value is greater than Integer.MAX_VALUE the method should return the max value for ints;
 * if the given value is lesser than Integer.MIN_VALUE the method should return the min value for ints;
 * otherwise, the method should return the same value as the passed argument.
 */

import java.util.Scanner;

public class Main {

    public static int convert(Long val) {
        // write your code here
        if (val == null) {
            return 0;
        } else if (val > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (val < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return val.intValue();
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        Long longVal = "null".equals(val) ? null : Long.parseLong(val);
        System.out.println(convert(longVal));
    }
}