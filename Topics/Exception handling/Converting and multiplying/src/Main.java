import java.util.Scanner;

/**
 * Your task is to write a program that reads a sequence of strings and converts them to integer numbers, multiplying
 * by 10. Some input strings may have an invalid format, for instance: "abc". The sequence length may be different.
 * Its ending is indicated by “0”. Zero serves as a stop character and should not be included in the sequence.
 *
 * If a string can be converted to an integer number, output the number multiplied by 10. Otherwise, output the string
 * "Invalid user input: X" where X is the input string. To better understand the scenario, see the examples below.
 *
 * To implement this logic, use the exception handling mechanism.
 */

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        while (!"0".equals(num)) {
            try {
                System.out.println(Integer.parseInt(num) * 10);
            } catch (Exception e) {
                System.out.println("Invalid user input: " + num);
            }
            num = scanner.nextLine();
        }
    }
}