import java.util.Scanner;

/**
 * Write a program that reads a string and checks whether it is a palindrome, i.e. it reads the same both left-to-right
 * and right-to-left.
 *
 * The program must output “yes” if the string is a palindrome and “no” otherwise.
 */

class Main {

    public static void checkPalindrome(String str) {
        String str1 = str.replace(" ", "");
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        String reverseStr = sb.toString();
        if (reverseStr.equalsIgnoreCase(str1)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        checkPalindrome(str);
    }
}