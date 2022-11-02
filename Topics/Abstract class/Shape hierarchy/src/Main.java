/**
 * You have an abstract class Shape with two abstract methods: getPerimeter() and getArea().
 * See the provided code template.
 *
 * You need to declare and implement three classes: Triangle, Rectangle and Circle. The classes must extend the Shape
 * class and implement all abstract methods. To implement the methods the standard class Math may help you.
 *
 * The class Triangle must have a constructor with three double arguments for setting the length of each side. To
 * calculate the area of this shape you may use Heron's formula.
 * The class Rectangle must have a constructor with two double arguments for setting the length of different sides.
 * The class Circle must have a constructor with one double argument for setting the radius. You may use Math.PI as
 * the PI constant or you can declare it yourself.
 */

abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Triangle extends Shape {

    double len1;
    double len2;
    double len3;

    public Triangle(double len1, double len2, double len3) {
        super();
        this.len1 = len1;
        this.len2 = len2;
        this.len3 = len3;
    }

    @Override
    double getPerimeter() {
        return len1 + len2 + len3;
    }

    @Override
    double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - len1) * (s - len2) * (s - len3));
    }
}

class Rectangle extends Shape {

    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        super();
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double getPerimeter() {
        return 2 * (length + breadth);
    }

    @Override
    double getArea() {
        return length * breadth;
    }
}

class Circle extends Shape {

    double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI  * radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}