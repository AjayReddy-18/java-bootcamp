package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyRectangleTest {
    @Test
    void areaOfRectangle() {
        int area = MyRectangle.area(2, 4);
        assertEquals(8, area);
    }

    @Test
    void areaOfFloatingDimensionRectanlge() {
        double area = MyRectangle.area(2.5, 4.5);
        assertEquals(11.25, area);
    }
}
