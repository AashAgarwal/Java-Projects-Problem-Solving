import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double distance = scanner.nextDouble();
        double time = scanner.nextDouble();
        double speed = distance / time;
        System.out.println(speed);
    }
}
