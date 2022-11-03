/**
 * You need to implement the calculateSquare method.
 *
 * It should output the square of the element by the provided index of an array. In the case when the exception might
 * happen, your program output should be: Exception!
 */

class FixingExceptions {

    public static void calculateSquare(int[] array, int index) {
        // write your code here
        if (array == null || index < 0 || index > array.length - 1) {
            System.out.println("Exception!");
        } else {
            System.out.println(array[index] * array[index]);
        }
    }
}