package models.circle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    public void getArea() {
        Circle circle = new Circle(2);
        double result = circle.getArea();

        assertEquals(12.5, result, 0.1);
    }
}