package com.example.javaproject2.week5.day2;

public class RightTriangleShapePrinter extends ShapePrinter {
    @Override
    public String makeALine(int i) {
        return null;
    }

    public static void main(String[] args) {
        ShapePrinter sp = new RightTriangleShapePrinter();
        sp.repeat(7);
    }
}
