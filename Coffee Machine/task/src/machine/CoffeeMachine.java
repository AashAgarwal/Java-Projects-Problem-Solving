package machine;

import java.util.Scanner;

/**
 * Coffee Machine
 * <p></p>
 * Description
 * Let's start with a program that makes you a coffee – virtual coffee, of course. In this project, you will implement
 * functionality that simulates a real coffee machine. It can run out of ingredients, such as milk or coffee beans, it
 * can offer you various types of coffee, and, finally, it will take money for the prepared drink.
 * <p></p>
 * Ingredient calculator
 * <p></p>
 * So, we will ask a user to enter the desired amount of coffee, in cups. Given this, you can adjust the program by
 * calculating how much water, coffee, and milk are necessary to make the specified amount of coffee.
 *<p></p>
 * Estimate the number of servings
 * <p></p>
 * A real coffee machine doesn't have an infinite supply of water, milk, or coffee beans. And if you input a huge number
 * it's almost certain that a real coffee machine wouldn't have the supplies needed to make all that coffee for you.
 * In this stage, it will check amounts of water, milk, and coffee beans available in your coffee machine at the moment.
 *<p></p>
 * Keep track of supplies
 * <p></p>
 * It should repeatedly ask a user what they want to do. If the user types "buy", "fill" or "take", then the program
 * should do exactly the same thing it did in the previous step. However, if the user wants to switch off the coffee
 * machine, they should type "exit". The program should terminate on this command. Also, when the user types
 * "remaining", the program should output all the resources that the coffee machine has. This means that you shouldn't
 * show the remaining stock levels at the beginning/end of the program.
 *<p></p>
 * Remember, that:
 *<p></p>
 * For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
 * <p></p>
 * For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
 * <p></p>
 * And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.
 * <p></p>
 * The class should have a method that takes a string as input. Every time the user inputs a string to the console,
 * the program invokes this method with one argument: the line that the user inputs to the console. This system
 * simulates pretty accurately how real-world electronic devices work. External components (like buttons on the
 * coffee machine or tapping on the screen) generate events that pass into the single interface of the program.
 */

public class CoffeeMachine {

    static final String RESOURCE_AVAILABLE = "I have enough resources, making you a coffee!";
    static final String OUT_OF_WATER = "Sorry, not enough water!";
    static final String OUT_OF_MILK = "Sorry, not enough milk!";
    static final String OUT_OF_BEANS = "Sorry, not enough coffee beans!";
    static final String OUT_OF_CUPS = "Sorry, not enough disposable cups!";
    static final String INVALID_SELECTION = "Invalid Selection";

    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static int[] resourceArrayMethod(int waterAvail, int milkAvail, int beansAvail, int disCups, int money) {
        int[] resArray = new int[5];
        resArray[0] = waterAvail;
        resArray[1] = milkAvail;
        resArray[2] = beansAvail;
        resArray[3] = disCups;
        resArray[4] = money;
        return resArray;
    }

    public static void action(String input, int[] resArray) {
        switch (input) {
            case "buy" -> {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, " +
                        "back - to main menu:");
                String option = getInput();
                buy(option, resArray);
            }
            case "fill" -> fill(resArray);
            case "take" -> take(resArray);
            case "remaining" -> stockLevel(resArray);
            case "exit" -> System.exit(1);
            default -> System.out.println(INVALID_SELECTION);
        }
    }

    public static void buy(String option, int[] resArray) {
        switch (option) {
            case "1": espresso(resArray);
                break;
            case "2": latte(resArray);
                break;
            case "3": cappuccino(resArray);
                break;
            case "back":
                return;
            default: System.out.println(INVALID_SELECTION);
        }
    }

    public static void espresso(int[] resArray) {
        if (resArray[0] >= 250 && resArray[2] >= 16 && resArray[3] >= 1) {
            System.out.println(RESOURCE_AVAILABLE);
            resArray[0] -= 250;
            resArray[2] -= 16;
            resArray[3] -= 1;
            resArray[4] += 4;
        } else if (resArray[0] < 250) {
            System.out.println(OUT_OF_WATER);
        } else if (resArray[2] < 16) {
            System.out.println(OUT_OF_BEANS);
        } else {
            System.out.println(OUT_OF_CUPS);
        }
    }

    public static void latte(int[] resArray) {
        if (resArray[0] >= 350 && resArray[1] >= 75 && resArray[2] >= 20 && resArray[3] >= 1) {
            System.out.println(RESOURCE_AVAILABLE);
            resArray[0] -= 350;
            resArray[1] -= 75;
            resArray[2] -= 20;
            resArray[3] -= 1;
            resArray[4] += 7;
        } else if (resArray[0] < 350) {
            System.out.println(OUT_OF_WATER);
        } else if (resArray[1] < 75) {
            System.out.println(OUT_OF_MILK);
        } else if (resArray[2] < 20) {
            System.out.println(OUT_OF_BEANS);
        } else {
            System.out.println(OUT_OF_CUPS);
        }
    }

    public static void cappuccino(int[] resArray) {
        if (resArray[0] >= 200 && resArray[1] >= 100 && resArray[2] >= 12 && resArray[3] >= 1) {
            System.out.println(RESOURCE_AVAILABLE);
            resArray[0] -= 200;
            resArray[1] -= 100;
            resArray[2] -= 12;
            resArray[3] -= 1;
            resArray[4] += 6;
        } else if (resArray[0] < 200) {
            System.out.println(OUT_OF_WATER);
        } else if (resArray[1] < 100) {
            System.out.println(OUT_OF_MILK);
        } else if (resArray[2] < 12) {
            System.out.println(OUT_OF_BEANS);
        } else {
            System.out.println(OUT_OF_CUPS);
        }
    }

    public static void fill(int[] resArray) {
        System.out.println("Write how many ml of water you want to add:");
        int water = Integer.parseInt(getInput());
        resArray[0] += water;
        System.out.println("Write how many ml of milk you want to add:");
        int milk = Integer.parseInt(getInput());
        resArray[1] += milk;
        System.out.println("Write how many grams of coffee beans you want to add:");
        int beans = Integer.parseInt(getInput());
        resArray[2] += beans;
        System.out.println("Write how many disposable cups you want to add:");
        int cups = Integer.parseInt(getInput());
        resArray[3] += cups;
    }

    public static void take(int[] resArray) {
        if (resArray[4] > 0) {
            System.out.printf("I gave you %d%n", resArray[4]);
            resArray[4] = 0;
        }
    }

    public static void stockLevel(int[] resArray) {
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water%n", resArray[0]);
        System.out.printf("%d ml of milk%n", resArray[1]);
        System.out.printf("%d g of coffee beans%n", resArray[2]);
        System.out.printf("%d disposable cups%n", resArray[3]);
        System.out.printf("$%d of money%n", resArray[4]);
    }

    public static void main(String[] args) {
        int moneyStored = 550;
        int waterAvailable = 400;
        int milkAvailable = 540;
        int beansAvailable = 120;
        int disCups = 9;
        int[] resArray = resourceArrayMethod(waterAvailable, milkAvailable, beansAvailable, disCups, moneyStored);
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String input = getInput();
        while (!"exit".equals(input)) {
            action(input, resArray);
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            input = getInput();
        }
    }
}
