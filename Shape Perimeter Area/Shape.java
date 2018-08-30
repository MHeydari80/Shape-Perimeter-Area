package shapetest;

public abstract class Shape {

    abstract double area();

    abstract double perimeter();

    abstract String className();

    public String toString() {

        return String.format("%s info\nPerimeter : %f\nArea : %f", this.className(), this.perimeter(), this.area());

    }

}
