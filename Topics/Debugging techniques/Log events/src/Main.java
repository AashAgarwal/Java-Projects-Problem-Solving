/**
 * Suppose, we have a utility method to capitalize strings:
 * Your task is to add some logging to this method so it prints the input string and the string to be returned by the
 * method in the following format:
 *
 * Before: string
 * After: String
 * where string is an example of the input string. As you can see, the method has three execution paths and they all
 * must be logged.
 */

class Util {
    public static String capitalize(String str) {
        System.out.println("Before: " + str);
        if (str == null || str.isBlank()) {
            System.out.println("After: " + str);
            return str;
        }

        if (str.length() == 1) {
            String str1 = str.toUpperCase();
            System.out.println("After: " + str1);
            return str1;
        }

        String str2 = Character.toUpperCase(str.charAt(0)) + str.substring(1);
        System.out.println("After: " + str2);
        return str2;
    }
}