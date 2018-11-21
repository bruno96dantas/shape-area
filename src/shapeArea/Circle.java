package shapeArea;

public class Circle extends Shape {


    public Circle(double number1, double number2) {
        super(number1, number2);
    }

    @Override
    double area() {
        return getA() * (getB() * getB());
    }

    @Override
    double perimeter() {
        return (getA() * getA()) * getB();
    }
}
