/**
 * You are given a class named Box that has three double fields.
 *
 * Create an instance method to calculate the volume of the box. The method must be named getVolume.
 * It should take no arguments and return a double result.
 *
 * Do not make the fields and method private!
 */

class Box {

    double height;
    double width;
    double length;

    // write a method here
    public double getVolume() {
        return this.height * this.width * this.length;
    }
}