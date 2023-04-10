package shapes;

import shapes.Measurable;
import shapes.Rectangle;
import shapes.Square;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;

        myShape = new Square(5.0);
        System.out.println("square area: " + myShape.getArea());
        System.out.println("square perimeter: " + myShape.getPerimeter());

        myShape = new Rectangle(4.0, 6.0);
        System.out.println("rectangle area: " + myShape.getArea());
        System.out.println("rectangle perimeter: " + myShape.getPerimeter());
    }
}