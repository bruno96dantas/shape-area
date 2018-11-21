package shapeArea;

abstract class Shape {

    private double a;
    private double b;

    Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double getA() {
        return a;
    }

    double getB() {
        return b;
    }

    abstract double area();

    abstract double perimeter();
}
