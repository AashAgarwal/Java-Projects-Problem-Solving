/**
 * In a template below you have a simple calculator that subtracts, sums, divides, and multiplies the two numbers
 * inside the switch statement. Now, we've decided to upgrade it to perform more complex tasks, such as logarithmic
 * functions. For that, separate methods are a better solution. Let's start with decomposing what we have.
 *
 * Take a look at the template and decompose operations of the calculator into four methods:
 * subtractTwoNumbers(long a, long b) for subtraction, sumTwoNumbers(long a, long b) for adding,
 * divideTwoNumbers(long a, long b) for integer division and multiplyTwoNumbers(long a, long b) for multiplication.
 * Each method should print the result of calculations.
 *
 * Note that you can't divide by zero. In case your second argument is zero, you should print
 * the "Division by 0!" message.
 */

class SimpleCalculator {

    // Implement your methods here
    public static void subtractTwoNumbers(long a, long b) {
        System.out.println(a - b);
    }


    public static void sumTwoNumbers(long a, long b) {
        System.out.println(a + b);
    }


    public static void divideTwoNumbers(long a, long b) {
        if (b == 0) {
            System.out.println("Division by 0!");
        } else {
            System.out.println(a / b);
        }
    }


    public static void multiplyTwoNumbers(long a, long b) {
        System.out.println(a * b);
    }

    // Implemented method
    public static void power(long n, long p) {
        long number = n;
        long power = p;
        long result = 1;
        while (power > 0) {
            if (power % 2 != 0) {
                result *= number;
            }
            power /= 2;
            number *= number;
        }
        System.out.println(result);
    }
}

public class Main {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        long num1 = scanner.nextLong();
        String operator = scanner.next();
        long num2 = scanner.nextLong();

        switch (operator) {
            case "^":
                SimpleCalculator.power(num1, num2);
                break;
            case "+":
                SimpleCalculator.sumTwoNumbers(num1, num2);
                break;
            case "-":
                SimpleCalculator.subtractTwoNumbers(num1, num2);
                break;
            case "/":
                SimpleCalculator.divideTwoNumbers(num1, num2);
                break;
            case "*":
                SimpleCalculator.multiplyTwoNumbers(num1, num2);
                break;
            default:
                break;
        }
    }
}