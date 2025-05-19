package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @Test
    void areaOfSquare() {
        Square square = new Square(4);
        int area = square.area();
        assertEquals(16, area);
    }

    @Test
    void perimeterOfSquare() {
        Square square = new Square(5);
        int perimeter = square.perimeter();
        assertEquals(20, perimeter);
    }
}
