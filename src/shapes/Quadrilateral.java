package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;


    public Quadrilateral(double lenght, double width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return length * width;
    }

    public abstract double getPerimeter();

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public abstract void setLength(double length);

    public abstract void setWidth(double width);
}




//package shapes;
//
//public abstract class Quadrilateral extends Shape implements Measurable {
//    protected double length;
//    protected double width;
//
//    public Quadrilateral(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getLength() {
//        return length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public abstract void setLength(double length);
//    public abstract void setWidth(double width);
//}