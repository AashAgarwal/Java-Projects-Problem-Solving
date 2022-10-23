import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.print(num + 2);
        } else {
            System.out.print(num + 1);
        }
    }
}
