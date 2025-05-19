package models;

import interfaces.Polygon;

public class MyRectangle implements Polygon {

    private final int length;
    private final int breadth;

    MyRectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
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
