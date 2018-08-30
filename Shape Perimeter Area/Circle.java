package shapetest;

public class Circle extends Shape {

    private double radius;
    private final int power = 2;

//    Getter and Setter Methods
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

//    Constructors 
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

//    Enharited abstract methods
    @Override
    public double area() {

        return Math.pow(getRadius(), power) * Math.PI;
    }

    @Override
    public double perimeter() {

        return (getRadius() + getRadius()) * Math.PI;

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
