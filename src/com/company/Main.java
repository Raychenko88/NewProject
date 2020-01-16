package com.company;

import abstracts.AbstractShape;
import models.circle.Circle;
import models.square.Square;
import models.triangle.Triangle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class Main{
    private static Logger log = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        log.info(String.valueOf(circle.getArea()));
        Square square = new Square( 4);
        log.info(String.valueOf(square.getArea()));
        Triangle triangle = new Triangle(5, 45);
        log.info(String.valueOf(triangle.getArea()));

        
        List <Double> list = new ArrayList<>();
        list.add(circle.getArea());
        list.add(square.getArea());
        list.add(triangle.getArea());

        log.info(String.valueOf(Collections.min(list)));
        log.info(String.valueOf(Collections.max(list)));
    }
}
