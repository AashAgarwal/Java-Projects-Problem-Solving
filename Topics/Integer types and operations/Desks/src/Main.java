import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();
        int desk1 = 0;
        int desk2 = 0;
        int desk3 = 0;
        if (group1 % 2 == 0) {
            desk1 = group1 / 2;
        } else {
            desk1 = group1 / 2 + 1;
        }
        if (group2 % 2 == 0) {
            desk2 = group2 / 2;
        } else {
            desk2 = group2 / 2 + 1;
        }
        if (group3 % 2 == 0) {
            desk3 = group3 / 2;
        } else {
            desk3 = group3 / 2 + 1;
        }
        System.out.println(desk1 + desk2 + desk3);
    }
}