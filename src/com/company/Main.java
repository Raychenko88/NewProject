package com.company;

import models.circle.Circle;
import models.square.Square;
import models.triangle.Triangle;
import java.util.logging.Logger;

public class Main {
    private static Logger log = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        Circle circle = new Circle(15);
        log.info(String.valueOf(circle.getArea()));
        Square square = new Square( 4);
        log.info(String.valueOf(square.getArea()));
        Triangle triangle = new Triangle(5, 45);
        log.info(String.valueOf(triangle.getArea()));
    }
}
