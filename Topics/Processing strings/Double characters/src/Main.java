import java.util.Scanner;

/**
 * Write a program that reads a string and then output another string with doubled characters.
 */

class Main {

    public static void doubledCharacters(String str) {
        String[] strArray = str.split("");
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + strArray[i]);
        }
    }

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        doubledCharacters(str);
    }
}