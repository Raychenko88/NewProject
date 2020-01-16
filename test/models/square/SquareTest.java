package models.square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getArea() {
        Square square = new Square(2.3);
        double result = square.getArea();

        assertEquals(5.2, result, 0.1);
    }
}