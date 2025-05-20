package models.math.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyRectangleTest {
    @Test
    void areaOfRectangle() {
        MyRectangle myRectangle = MyRectangle.createRectangle(2, 4);
        int area = myRectangle.area();
        assertEquals(8, area);
    }

    @Test
    void perimeterOfRectangle() {
        MyRectangle myRectangle =  MyRectangle.createRectangle(2,4);
        int perimeter = myRectangle.perimeter();
        assertEquals(12, perimeter);
    }
}
