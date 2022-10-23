/**
 * Jake wants to write a program that works with complex numbers. He created a class Complex that represents a complex
 * number with its real and imaginary parts. Now he needs instance methods so that he can calculate the sum and
 * difference of two complex numbers.
 *
 * Help Jake and create two instance methods for his class:
 *
 * add(Complex num) that takes another complex number as an argument and adds its corresponding fields to the current
 * instance;
 * subtract(Complex num) that takes another complex number as an argument and subtracts its corresponding fields from
 * the current instance;
 * Both methods should return nothing.
 */

class Complex {

    double real;
    double image;

    // write methods here
    public void add(Complex num) {
        real = this.real + num.real;
        image = this.image + num.image;
    }

    public void subtract(Complex num) {
        real = this.real - num.real;
        image = this.image - num.image;
    }
}