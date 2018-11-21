package shapeArea;

public class Triangle extends Shape {


    public Triangle(double number1, double number2) {
        super(number1, number2);
    }

    @Override
    double area() {
        return (getA() * getB()) / 2;
    }

    @Override
    double perimeter() {
        return getA() * 3;
    }

}
