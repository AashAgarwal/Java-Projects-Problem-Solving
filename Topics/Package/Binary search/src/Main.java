/**
 * The class Arrays includes a lot of useful methods for processing arrays. One of them is the binarySearch method.
 * It allows you to quickly find the index of an element in the given ordered array. You just need to pass the array
 * of values and the value to search for to this method.
 *
 * In this quiz, you need to call this method from the Arrays class without using an import statement.
 *
 * Do not use your own implementation of the searching method, it may not work with prepared tests.
 */

class BinarySearch {
    /**
     * @param nums ordered sequence of integers
     * @param key  an element for searching
     * @return index of key or a negative value
     */
    public static int callBinarySearch(int[] nums, int key) {
        // write your code here
        return java.util.Arrays.binarySearch(nums, key);
    }
}