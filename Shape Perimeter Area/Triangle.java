package shapetest;

public class Triangle extends Shape {

    private double side, height;

    //    Getter and Setter Methods
    public double getSide() {
        return side;
    }

    public double getHeight() {
        return height;
    }

    public double[] getHeightSide() {

        double[] total = new double[2];

        total[0] = this.getHeight();
        total[1] = this.getSide();

        return total;

    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setHeightSide(double side, double height) {

        this.setHeight(height);
        this.setSide(side);

    }
//    Constructors 

    public Triangle(double side, double height) {

        this.setHeight(height);
        this.setSide(side);

    }

    public Triangle() {
    }

    //    Enharited abstract methods
    @Override
    public double area() {

        return side * height / 2;
    }

    @Override
    public double perimeter() {

        return side * 3;

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
