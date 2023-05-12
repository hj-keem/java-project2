package com.example.javaproject2.week4.day3;

public abstract  class RightTriangleDraw {
    public abstract String makeALine(int h, int i);
    //{
//        return String.format("%s%s\n"," ".repeat(h-i), "*".repeat(2*i-1));
//    }
    public void printShape() {
        int h= 5;
        for (int i = 1; i <= h; i++) {
            System.out.println(makeALine(h,i));
        }
    }
    public static void main(String[] args) {
//        RightTriangleDraw rightTriangleDraw = new RightTriangleDraw();
//        rightTriangleDraw.printShape();
    }
}
