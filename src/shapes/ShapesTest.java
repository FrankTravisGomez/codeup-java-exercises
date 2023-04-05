package shapes;

import shapes.Measurable;
import shapes.Rectangle;
import shapes.Square;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;

        myShape = new Square(5.0);
        System.out.println("Square area: " + myShape.getArea());
        System.out.println("Square perimeter: " + myShape.getPerimeter());

        myShape = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle area: " + myShape.getArea());
        System.out.println("Rectangle perimeter: " + myShape.getPerimeter());
    }
}