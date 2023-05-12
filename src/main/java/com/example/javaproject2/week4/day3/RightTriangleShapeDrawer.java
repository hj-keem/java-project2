package com.example.javaproject2.week4.day3;

public class RightTriangleShapeDrawer extends ShapeDrawer2 {
    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s\n"," ", "*".repeat(i));
    }

    public static void main(String[] args) {
        ShapeDrawer2 shapeDrawer2 = new RightTriangleShapeDrawer(); //부모의 타입으로도 new를 할 수 있다.
        shapeDrawer2.printShape(5);
    }
}
