package shapetest;

public class Rectangle extends Shape {

    private double width, height;

    //    Getter and Setter Methods
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double[] getHeightWidth() {

        double[] total = new double[2];

        total[0] = this.getHeight();
        total[1] = this.getWidth();

        return total;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setHeightWidth(double height, double width) {

        this.setHeight(height);
        this.setWidth(width);

    }
    //    Constructors 

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    //    Enharited abstract methods
    @Override
    public double area() {

        return this.getHeight() * this.getWidth();

    }

    @Override
    public double perimeter() {

        return (this.getHeight() + this.getWidth()) * 2;

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
