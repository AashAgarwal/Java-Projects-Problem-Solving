import java.util.Scanner;

/**
 * Write a program that takes a sentence as input and returns the index of the first occurrence of the word "the"
 * (can be part of a word), regardless of the capitalization. If there is no occurrence of it must output -1.
 *
 * For instance, if the sentence is “The apple is red.” the output should be 0, if the sentence is “I ate the red apple.
 * ” the output should be 6, and if the sentence is “I love apples.” the output should be -1.
 *
 * Note, the and The are equal.
 */

class Main {

    public static int firstOccurence(String str) {
        char[] charArray = str.toLowerCase().toCharArray();
        int index = -1;
        for (int i = 0; i < charArray.length - 2; i++) {
            if (charArray[i] == 't' && charArray[i + 1] == 'h' && charArray[i + 2] == 'e') {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(firstOccurence(str));
    }
}