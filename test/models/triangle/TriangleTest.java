package models.triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void getArea() {
        Triangle triangle = new Triangle(2.2, 3.2);
        double result = triangle.getArea();

        assertEquals(3.5, result, 0.1);
    }
}