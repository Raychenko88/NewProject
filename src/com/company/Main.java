package com.company;

import GeometricFigures.Circle.Circle;
import GeometricFigures.Square.Square;
import GeometricFigures.Triangle.Triangle;
import java.util.logging.Logger;

public class Main {
    private static Logger log = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        Circle circle = new Circle("Круг", 15);
        log.info(circle.toString());
        Square square = new Square("Квадрат", 4);
        log.info(square.toString());
        Triangle triangle = new Triangle("Треугольник", 5, 45);
        log.info(triangle.toString());
    }
}


//    Создать интерфейс  , абстрактный класс AbstractShape(имплементирует Shape)
//    и три его наследника(каждый в отдельном пакете) Circle, Square, Triangle,
//    которые реализуют метод интерфейса getArea() для нахождения их площадей
