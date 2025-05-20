package models.math.shapes;

import interfaces.Polygon;

public class MyRectangle implements Polygon {

    private final int length;
    private final int breadth;

    MyRectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public static MyRectangle createRectangle(int length, int breadth) {
        return new MyRectangle(length, breadth);
    }

    public static MyRectangle createSquare(int side) {
        return new MyRectangle(side, side);
    }

    @Override
    public int area() {
        return length * breadth;
    }

    @Override
    public int perimeter() {
        return 2 * (length + breadth);
    }
}
