package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathLibTest {
    @Test
    void addTwoNumbers() {
        MathLib mathLib = new MathLib();
        int sum = mathLib.add(1, 2);
        
        assertEquals(3, sum);
    }

    @Test
    void subTwoNumbers() {
        MathLib mathLib = new MathLib();
        int sub = mathLib.sub(2, 1);

        assertEquals(1, sub);
    }
}
