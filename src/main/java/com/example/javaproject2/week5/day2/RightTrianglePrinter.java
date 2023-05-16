package com.example.javaproject2.week5.day2;

public abstract class ShapePrinter { //RightTrianglePrinter
    public abstract String makeALine(int i) ;
//    {
//        return "*".repeat(i);
//    }
    public void repeat(int h){
        for (int i = 1; i < h; i++) {
            System.out.println(makeALine(i));
        }
    }
    public static void main(String[] args) {
        //
        /*
        *
        **
        ***
         */
        ShapePrinter rtp = new RightTriangleShapePrinter();
    }
}
