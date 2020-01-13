package GeometricFigures.Square;

import AbstractClasses.AbstractShape;


public class Square extends AbstractShape {
    double side;
    public Square(String s, double side) {
        super(s);
        this.side = side;
    }

    @Override
    public double getArea() {
        double result;
        result = Math.pow(side, 2);
        return result;
    }


}
