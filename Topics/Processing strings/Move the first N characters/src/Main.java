import java.util.Scanner;

class Main {

    public static void newString(String str, int n) {
        if (n < str.length()) {
            String subString1 = str.substring(0, n);
            String subString2 = str.substring(n);
            System.out.println(subString2 + subString1);
        } else {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int n = scanner.nextInt();
        newString(str, n);
    }
}