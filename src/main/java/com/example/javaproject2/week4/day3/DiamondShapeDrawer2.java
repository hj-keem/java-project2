package com.example.javaproject2.week4.day3;

public class DiamondShapeDrawer2 extends ShapeDrawer2{
    public static String getRepeatSymbol(String symbol, int n){
        return symbol.repeat(n);
    }
    @Override
    public String makeALine(int h, int i) {
        int pivot = h/2;
        if (i <= pivot) {
            return String.format("%s%s\n", getRepeatSymbol(" ", -2 + h - i - 2), getRepeatSymbol("*", 2 * i + 1));
        } else {
            return String.format("%s%s\n", getRepeatSymbol(" ", i - pivot), getRepeatSymbol("*", 2 * (h - i) - 1));
        }
    }

    public static void main(String[] args) {
        ShapeDrawer2 shapeDrawer2 = new DiamondShapeDrawer2();
        shapeDrawer2.printShape(7);
    }
}
