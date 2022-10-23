/**
 * There is a class named Circle. This class has one field radiusof the double type.
 *
 * Create two instance methods for this class:
 *
 * getLength that returns the double representing the length of the circumference of this circle;
 * getArea that returns the double representing the area of this circle.
 * In your calculations, you may use the special constant Math.PI.
 *
 * Do not make the field and methods private.
 */

class Circle {

    double radius;

    // write methods here
    public double getLength() {
        return 2 * Math.PI * this.radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}