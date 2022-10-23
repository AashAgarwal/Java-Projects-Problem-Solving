/**
 * Write a program that reads a temperature in Celsius (°C) and shows its equivalent in Fahrenheit (°F).
 *
 * Use the following formula:
 *
 * F = C * 1.8 + 32
 * where C is a temperature in Celsius and F is the corresponding temperature in Fahrenheit.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double temperatureInCelsius = scanner.nextDouble();
        double temperatureInFahrenheit = temperatureInCelsius * 1.8 + 32;
        System.out.println(temperatureInFahrenheit);
    }
}