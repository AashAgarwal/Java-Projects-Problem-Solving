/**
 * Read a string representing a house and output the following:
 *
 * if it is "gryffindor", output "bravery";
 * if it is "hufflepuff", output "loyalty";
 * if it is "slytherin", output "cunning";
 * if it is "ravenclaw", output "intellect";
 * otherwise, output "not a valid house".
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str = scanner.nextLine();
        switch (str) {
            case "gryffindor":
                System.out.println("bravery");
                break;
            case "hufflepuff":
                System.out.println("loyalty");
                break;
            case "slytherin":
                System.out.println("cunning");
                break;
            case "ravenclaw":
                System.out.println("intellect");
                break;
            default:
                System.out.println("not a valid house");
                break;
        }
    }
}