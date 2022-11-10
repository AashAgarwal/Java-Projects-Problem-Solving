package bullscows;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static String generateSecretCode(int n, int symbol) {
        StringBuilder sb = new StringBuilder();
        while (n > sb.length()){
            Random random = new Random();
            if (symbol < 10) {
                char ch = (char) (random.nextInt((48 + symbol) - 48 + 1) + '0');
                if (!sb.toString().contains(Character.toString(ch))) {
                    sb.append(ch);
                }
            } else {
                for (int i = 0; i < 9; i++) {
                    char ch = (char) (random.nextInt(57 - 48 + 1) + '0');
                    if (!sb.toString().contains(Character.toString(ch))) {
                        sb.append(ch);
                    }
                }
                for (int i = 10; i < symbol; i++) {
                    char ch1 = (char) (random.nextInt((97 + Math.min(symbol, 25)) - 97 + 1) + 'a');
                    if (!sb.toString().contains(Character.toString(ch1))) {
                        sb.append(ch1);
                    }
                }
            }
        }
        return sb.toString();
    }

    public static String[] generateSecretArray(int n, int symbol) {
        String secretCode = generateSecretCode(n, symbol);
        return secretCode.split("");
    }

    public static String[] createInputArray(String input) {
        return input.split("");
    }

    public static void checkBullsAndCows(int n, int symbol) {
        Scanner scanner = new Scanner(System.in);
        int countBulls = 0;
        int countCows = 0;
        String[] secretArray = generateSecretArray(n, symbol);
        System.out.println(Arrays.toString(secretArray));
        int turnCounter = 1;
        while (countBulls != n) {
            System.out.printf("Turn %d:%n", turnCounter);
            String input = scanner.next();
            String[] inputArray = createInputArray(input);
            for (int i = 0; i < n; i++) {
                if (Objects.equals(inputArray[i], secretArray[i])) {
                    countBulls++;
                }
                for (int j = i + 1; j < n; j++) {
                    if (Objects.equals(secretArray[i], inputArray[j])) {
                        countCows++;
                    }
                }
            }
            turnCounter++;
            print(countBulls, countCows, n);
            if (countBulls == n) {
                break;
            } else {
                countBulls = 0;
                countCows = 0;
            }
        }
    }

    public static void print(int countBulls, int countCows, int n) {
        if (countBulls > 0 && countCows > 0) {
            System.out.printf("Grade: %d bull(s) and %d cow(s)%n", countBulls, countCows);
        } else if (countBulls > 0 && countBulls < n) {
            System.out.printf("Grade: %d bull(s)%n", countBulls);
        } else if (countCows > 0) {
            System.out.printf("Grade: %d cow(s)%n", countCows);
        } else if (countBulls == n) {
            System.out.printf("Grade: %d bulls%n", countBulls);
            System.out.println("Congratulations! You guessed the secret code.");
        } else {
            System.out.println("Grade: None");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the secret code's length:");
        try {
            int n = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the number of possible symbols in the code:");
            int symbols = Integer.parseInt(scanner.nextLine());
            if (symbols > 36) {
                System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z)");
                System.exit(0);
            } else if (symbols < n) {
                System.out.print("Error: it's not possible to generate a code with a length of ");
                System.out.printf("%d with %d unique symbols.%n", n, symbols);
                System.exit(0);
            }
            System.out.print("The secret is prepared: ");
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            if (symbols > 9) {
                System.out.printf("(0-9, a-%s).", Character.toString(symbols + 86));
            } else {
                System.out.printf("(0-%s).", Character.toString(symbols + 48));
            }
            System.out.println("Okay, let's start a game!");
            if (n < 1) {
                System.out.println("Error!");
            } else {
                checkBullsAndCows(n, symbols);
            }
        } catch (Exception e) {
            System.out.println("Error in input data");
        }
    }
}
