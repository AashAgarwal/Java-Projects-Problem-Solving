/**
 * You have five classes: Shape, Triangle, Circle, Square, and Rectangle. The class Shape has a method area().
 * This method does nothing. Override the method in all subclasses. Overridden methods should return an area of a
 * particular figure. Use class fields for this.
 */

class Shape {
    public double area() {
        return 0;
    }
}

class Triangle extends Shape {
    double height;
    double base;

    // override the method here
    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

class Circle extends Shape {
    double radius;

    // override the method here
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    double side;

    // override the method here
    @Override
    public double area() {
        return side * side;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    // override the method here
    @Override
    public double area() {
        return width * height;
    }
}