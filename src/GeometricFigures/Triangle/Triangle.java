package GeometricFigures.Triangle;

import AbstractClasses.AbstractShape;


public class Triangle extends AbstractShape {
    double width;
    double height;

    public Triangle(String s, double width, double height) {
        super(s);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        double result;
        result = width * height / 2;
        return result;
    }
}
