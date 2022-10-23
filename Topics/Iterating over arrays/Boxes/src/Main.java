import java.util.*;

/**
 * There are two boxes on the table. The first box has a size of X1 x Y1 x Z1, and the second box has a size of
 * X2 x Y2 x Z2.
 * You need to determine whether one of the boxes can be put inside the other. It should go in without sticking out.
 * You can rotate both boxes as you want.
 *
 * Important: two equally sized boxes cannot be placed inside one another. See the third test case as an example of
 * how the borderline case should be treated.
 *
 * Input consists of two lines:
 *
 * the first line contains numbers X1, Y1, Z1;
 * the second line contains numbers X2, Y2, Z2.
 * All numbers are integers and greater than 0.
 *
 * Output:
 *
 * "Box 1 < Box 2", if the first box can be put inside the second box ;
 * "Box 1 > Box 2", if the second box can be put inside the first box;
 * otherwise, output "Incompatible".
 */

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int[] box1Dimensions = new int[3];
        int[] box2Dimensions = new int[3];
        for (int i = 0; i < box1Dimensions.length; i++) {
            box1Dimensions[i] = scanner.nextInt();
        }
        for (int i = 0; i < box2Dimensions.length; i++) {
            box2Dimensions[i] = scanner.nextInt();
        }
        Arrays.sort(box1Dimensions);
        Arrays.sort(box2Dimensions);
        int counterA = 0;
        int counterB = 0;
        for (int i = 0; i < 3; i++) {
            if (box1Dimensions[i] > box2Dimensions[i]) {
                counterA++;
            } else if (box2Dimensions[i] > box1Dimensions[i]) {
                counterB++;
            }
        }
        if (counterA == 3) {
            System.out.println("Box 1 > Box 2");
        } else if (counterB == 3) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}