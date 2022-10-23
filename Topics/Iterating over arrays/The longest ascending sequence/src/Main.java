import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a program that reads an array of ints and outputs the length of the longest sequence in strictly ascending
 * order. Elements of the sequence must go one after another. A single number is assumed to be an ordered sequence
 * with the length = 1.
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
        ArrayList<Integer> maxCounter = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            int counter = 1;
            for (int j = 0; j < len - 1; j++) {
                if (array[j] < array[j + 1]) {
                    counter++;
                } else {
                    maxCounter.add(counter);
                    counter = 1;
                }
            }
            maxCounter.add(counter);
        }
        int max = maxCounter.get(0);
        for (int i = 0; i < maxCounter.size(); i++) {
            if (max < maxCounter.get(i)) {
                max = maxCounter.get(i);
            }
        }
        System.out.println(max);
    }
}