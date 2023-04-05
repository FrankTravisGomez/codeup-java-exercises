//package shapes;
//
//public class Rectangle {
//    protected double length;
//    protected double  width;
//
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//
//
//    public double getPerimeter() {
//        return 2 * length + 2 * width;
//    }
//
//    public double getArea() {
//        return length * width;
//    }
//}
// the above code is from Inheritance and polymorphism

package shapes;

public class Rectangle extends Quadrilateral {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
}
