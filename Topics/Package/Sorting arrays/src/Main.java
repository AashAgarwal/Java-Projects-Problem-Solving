/**
 * The class Arrays provides a number of useful methods for processing arrays. Among them, there's a commonly used one
 * called sort. It allows you to sort any array (string array, integer array, or even object array ). It accepts one
 * argument: the array itself. It modifies the array, returning nothing.
 *
 * In this task, you need to call this method from the Arrays class without using an import statement.
 */

class ArraySorting {
    /**
     * @param array unordered sequence of strings
     * @return ordered array of strings
     */
    public static String[] sortArray(String[] array) {
        // write your code here
        java.util.Arrays.sort(array);
        return array;
    }
}