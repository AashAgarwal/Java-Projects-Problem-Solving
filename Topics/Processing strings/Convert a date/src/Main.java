import java.util.Scanner;

/**
 * Write a program that takes a date string formatted as YYYY-MM-DD as input, then converts and outputs it as MM/DD/YYYY
 *
 * For instance, the input 2007-07-21 will result in the following output 07/21/2007.
 */

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strArray = str.split("-");
        System.out.print(strArray[1] + "/" + strArray[2] + "/" + strArray[0]);
    }
}