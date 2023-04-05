//package shapes;
//
//public class Square extends Rectangle{
//    public Square(double side) {
//        super(side, side);
//    }
//
//    @Override
//    public double getArea(){
//        return Math.pow(width, 2);
//    }
//
//    @Override
//    public double getPerimeter(){
//        return 4* width;
//    }
//}
// the above code is from Inheritance and polymorphism


package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }
}