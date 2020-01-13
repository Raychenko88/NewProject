package models.triangle;

import abstracts.AbstractShape;


public class Triangle extends AbstractShape {
    double width;
    double height;

    public Triangle(double width, double height) {
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
