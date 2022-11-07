/**
 *A password is hard to crack if it contains at least A uppercase letters, at least B lowercase letters, at least C
 * digits and consists of exactly N symbols. Also, a password cannot contain two or more of the same characters in a
 * row.
 *
 * For the given numbers A, B, C, and N, you should output a password that matches these requirements.
 *
 * It is guaranteed that A, B, C, and N are non-negative integers, and A + B + C <= N. Keep in mind that any parameter
 * can be equal to zero. It means that it's ok if the password doesn't contain symbols of such type.
 */

import java.util.*;

public class Main {

    public static void generatePassword(int a, int b, int c, int n) {
        StringBuilder sb = new StringBuilder();
        char upperChar = 'A';
        char lowerChar = 'a';
        char digit = '0';
        char excess = '@';
        for (int i = 0; i < a; i++) {
            sb.append(upperChar);
            upperChar++;
            if (upperChar == 'Z') {
                upperChar -= 25;
            }
        }
        for (int j = 0; j < b; j++) {
            sb.append(lowerChar);
            lowerChar++;
            if (lowerChar == 'z') {
                lowerChar -= 25;
            }
        }
        for (int k = 0; k < c; k++) {
            sb.append(digit);
            digit++;
            if (digit == '9') {
                digit -= 9;
            }
        }
        for (int m = 0; m < n - (a + b + c); m++) {
            sb.append(excess);
            excess++;
            if (excess == 'z') {
                excess -= 50;
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();
        generatePassword(a, b, c, n);
    }
}