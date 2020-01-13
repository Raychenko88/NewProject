package GeometricFigures.Circle;

import AbstractClasses.AbstractShape;


public class Circle extends AbstractShape {
    double radius;
    public Circle(String s, double r) {
        super(s);
        radius = r;
    }

    @Override
    public double getArea() {
        double result;
        result = Math.PI * radius * radius;
        return result;
    }


}
