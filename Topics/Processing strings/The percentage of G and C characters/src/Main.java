import java.util.Scanner;

/**
 * GC-content is an important feature of the genome sequences and is defined as the percentage ratio of the sum of all
 * guanines and cytosines to the overall number of nucleic bases in the genome sequence.
 *
 * Write a program, which calculates the percentage of G characters (guanine) and C characters (cytosine) in the entered
 * string. Your program should be case independent.
 *
 * For example, in the string "acggtgttat" the percentage of characters G and C equals to 410⋅100=40.0, where 4 is the
 * number of symbols G and C, and 10 is the length of the string.
 *
 * Note, answer should be double.
 */

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] charArray = str.toLowerCase().toCharArray();
        int count = 0;
        for (char c : charArray) {
            if (c == 'c' || c == 'g') {
                count++;
            }
        }
        System.out.println((double) count / charArray.length * 100);
    }
}