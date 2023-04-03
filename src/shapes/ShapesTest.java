package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(5, 4);

        double perimeter = box1.getPerimeter();
        double area = box1.getArea();

        System.out.println("perimeter of box1: " + perimeter);
        System.out.println("area of box1: " + area);

        Rectangle box2 = new Square(5);

        double perimeter2 = box2.getPerimeter();
        double area2 = box2.getArea();

        System.out.println("perimeter of box1: " + perimeter2);
        System.out.println("area of box1: " + area2);
    }
}
