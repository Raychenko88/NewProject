package models.square;

import abstracts.AbstractShape;


public class Square extends AbstractShape {
    double side;
    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        double result;
        result = Math.pow(side, 2);
        return result;
    }
}
