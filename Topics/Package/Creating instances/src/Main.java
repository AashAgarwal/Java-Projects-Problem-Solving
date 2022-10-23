/**
 * Packages allow you to access both constructors and static methods.
 *
 * Now you're working with an application that multiplies a provided number by 200. There's a special class that is
 * used for operating on large numbers called BigInteger.
 *
 * In this task, you will need to access this class without importing it. Its constructor accepts only one argument:
 * a string with a number (for example, "1264"). It is located in the java.math package.
 *
 * You need to create an instance of this class with the number given in the method, and return it.
 *
 * The program will then multiply it – you don't need to perform multiplication.
 */

class BigIntegerConverter {

    /**
     * @param number string representing the number
     * @return BigInteger instance
     */
    public static Number getBigInteger(String number) {
        return new java.math.BigInteger(number); // create BigInteger instance here
    }
}