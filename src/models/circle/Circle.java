package models.circle;

import abstracts.AbstractShape;


public class Circle extends AbstractShape {
    double radius;
    public Circle(double r) {
        radius = r;
    }

    @Override
    public double getArea() {
        double result;
        result = Math.PI * radius * radius;
        return result;
    }
}
