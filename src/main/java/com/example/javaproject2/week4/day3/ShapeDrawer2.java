package com.example.javaproject2.week4.day3;

public abstract class ShapeDrawer2 {
    public abstract String makeALine(int h, int i);
    //{
//        return String.format("%s%s\n"," ".repeat(h-i), "*".repeat(2*i-1));
//    }
    public void printShape(int height) {
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height,i));
        }
    }
}
