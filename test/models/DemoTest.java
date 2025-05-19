package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    @Test
    void getA() {
        Demo demo = new Demo(1, 2);
        int a = demo.getA();
        assertEquals(1, a);
    }

    @Test
    void getB() {
        Demo demo = new Demo(2, 3);
        int b = demo.getB();
        assertEquals(3, b);
    }
}