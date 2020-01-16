package com.company;

import abstracts.AbstractShape;
import models.circle.Circle;
import models.square.Square;
import models.triangle.Triangle;

import java.util.ArrayList;
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


        List <AbstractShape> list = new ArrayList<>();
        list.add(circle);
        list.add(square);
        list.add(triangle);

        double min = list.get(0).getArea();
        String minStr = String.valueOf(list.get(0).getClass());
        double max = list.get(0).getArea();
        String maxStr = String.valueOf(list.get(0).getClass());

        for (int i = 1; i < list.size(); i++){
            if (min > list.get(i).getArea()){
                min = list.get(i).getArea();
                minStr = String.valueOf(list.get(i).getClass());
            }else if (max < list.get(i).getArea()){
                max = list.get(i).getArea();
                maxStr = String.valueOf(list.get(i).getClass());
            }
        }
        log.info(minStr + " " + min);
        log.info(maxStr + " " + max);
    }
}
