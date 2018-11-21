package shapeArea;

public class Rectangle extends Shape {


    public Rectangle(double number1, double number2) {
        super(number1, number2);
    }

    @Override
    double area() {
        return getA() * getB();
    }

    @Override
    double perimeter() {
        return 2 * (getA() + getB());
    }
}
