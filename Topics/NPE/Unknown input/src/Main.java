/**
 * Correct the code so it doesn't throw an exception.
 */

class Util {
    // correct this method to avoid NPE
    public static void printLength(String name) {
        if (name == null) {
            System.out.println("");
        } else {
            System.out.println(name.length());
        }
    }
}