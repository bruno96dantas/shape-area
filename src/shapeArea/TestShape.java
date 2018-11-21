package shapeArea;

public class TestShape {

    public static void main(String[] args) {

        Shape shape = new Circle(3.14, 10);

        checkDimensions(shape);

        shape = new Rectangle(5, 2);

        checkDimensions(shape);

        shape = new Triangle(5, 2);

        checkDimensions(shape);

        shape = new Square(4,4);

        checkDimensions(shape);

    }

    private static void checkDimensions(Shape obj){
        System.out.println(obj.getClass().toString().replaceAll("shapeArea.", ""));
        System.out.println("Area: " + obj.area());
        System.out.println("Perimeter: " + obj.perimeter());
    }
}
