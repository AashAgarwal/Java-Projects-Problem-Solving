/**
 * Imagine a chocolate bar. Remember how it is usually split into smaller bits by a special grid?
 *
 * Now think of chocolate as an N x M rectangle divided into little segments: N segments in length and M in width.
 * Each segment is 1x1 and unbreakable. Find out whether it is possible to break off exactly K segments from the
 * chocolate with a single straight line: vertical or horizontal.
 *
 * Input data format
 *
 * The program gets an input of three integers: N, M, K.
 *
 * Output data format
 *
 * The program must output one of the two words: YES or NO.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int lengthOfChocolate = scanner.nextInt();
        int widthOfChocolate = scanner.nextInt();
        int verifySegment = scanner.nextInt();

        if (verifySegment % lengthOfChocolate == 0 && verifySegment < (lengthOfChocolate * widthOfChocolate)) {
            System.out.println("YES");
        } else if (verifySegment % widthOfChocolate == 0 && verifySegment < (lengthOfChocolate * widthOfChocolate)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}