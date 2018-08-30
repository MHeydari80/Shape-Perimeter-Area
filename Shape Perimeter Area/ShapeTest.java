package shapetest;

import java.util.Scanner;

public class ShapeTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Circle circle = new Circle(input.nextDouble());
//
//        Rectangle rectangle = new Rectangle(input.nextDouble(), input.nextDouble());
//
//        Square square = new Square(input.nextDouble());
//
//        Triangle triangle = new Triangle(input.nextDouble(),input.nextDouble());
//

        System.out.println(circle);

    }

}
