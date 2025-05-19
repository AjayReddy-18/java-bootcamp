package models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @Test
    void areaOfSquare() {
        MyRectangle square = MyRectangle.createSquare(4);
        int area = square.area();
        assertEquals(16, area);
    }

    @Test
    void perimeterOfSquare() {
        MyRectangle square = MyRectangle.createSquare(5);
        int perimeter = square.perimeter();
        assertEquals(20, perimeter);
    }
}
