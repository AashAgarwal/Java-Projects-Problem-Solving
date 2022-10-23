import java.util.Scanner;

/**
 * Write a program that reads an array of ints and outputs the number of "triples" in the array.
 *
 * A "triple" is three consecutive ints in increasing order differing by 1 (i.e. 3,4,5 is a triple, but 5,4,3 and
 * 2,4,6 are not). Triples may overlap. For example, the sequence 1, 2, 3, 4, 5 contains three triples:
 * 1, 2, 3; 2, 3, 4; and 3, 4, 5.
 *
 * Input data format
 *
 * The first line contains the size of an array.
 * The second line contains elements of the array separated by spaces.
 */

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        int triples = 0;
        for (int j = 0; j < len - 2; j++) {
            if (array[j + 1] - array[j] == 1 && array[j + 2] - array[j + 1] == 1) {
                triples++;
            }
        }
        System.out.println(triples);
    }
}