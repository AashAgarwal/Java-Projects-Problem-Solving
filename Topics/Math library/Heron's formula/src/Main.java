import java.util.Scanner;

/**
 * Many years ago when Paul went to school, he did not like the Heron's formula to calculate the area of a triangle,
 * because he considered it very complex. Once he decided to help all school students and write and distribute a program
 * calculating the area of a triangle by its three sides.
 *
 * However, there was a problem: as Paul did not like the formula, he did not memorize it. Help him finish this act of
 * kindness and write the program calculating the area of a triangle with the known length of its sides, in accordance
 * with Heron's formula:
 *
 * S=p(p−a)(p−b)(p−c)‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾√
 * where p=a+b+c2 is the half-perimeter of the triangle. In the input, the program has integers, and the output should
 * be a real number corresponding to the area of the triangle.
 */

class Main {

    public static double heronFormula(int sideA, int sideB, int sideC) {
        double semiPeri = (double) (sideA + sideB + sideC) / 2;
        return Math.sqrt(semiPeri * (semiPeri - sideA) * (semiPeri - sideB) * (semiPeri - sideC));
    }

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double area = heronFormula(a, b, c);
        System.out.println(area);
    }
}