package shapetest;

public class Square extends Shape {

    private double side;

    //    Getter and Setter Methods
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
//    Constructors 

    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }

//    Enharited abstract methods
    @Override
    public double area() {

        return Math.pow(side, 2);
    }

    @Override
    public double perimeter() {

        return side * 4;

    }

    @Override
    public String className() {

        return this.getClass().getSimpleName();

    }

//    toString method
    public String toString() {

        return super.toString();

    }
}
