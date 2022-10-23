/**
 * Find the number of D, C, B and A grades for the last test on informatics, where n students from a class have
 * successfully passed the test.
 *
 * The program gets number n as the first line of input and then gets the grades themselves, each on a new line.
 *
 * The program must output four numbers in a single line: the number of D, C, B, and A grades (in that order),
 * separated by blank space characters.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int input = scanner.nextInt();
        scanner.nextLine();
        int numOfAGrades = 0;
        int numOfBGrades = 0;
        int numOfCGrades = 0;
        int numOfDGrades = 0;
        String[] array = new String[input];
        for (int i = 0; i < input; i++) {
            array[i] = scanner.nextLine();
            if (array[i].equals("A")) {
                numOfAGrades++;
            } else if (array[i].equals("B")) {
                numOfBGrades++;
            } else if (array[i].equals("C")) {
                numOfCGrades++;
            } else if (array[i].equals("D")) {
                numOfDGrades++;
            }
        }
        System.out.print(numOfDGrades + " " + numOfCGrades + " " + numOfBGrades + " " + numOfAGrades);
    }
}