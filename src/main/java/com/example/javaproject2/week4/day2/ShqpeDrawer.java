package com.example.javaproject2.week4.day2;

public abstract class ShqpeDrawer { //abstract class와 Abstract method 만드는 법
    public void printPyramid(int height){
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height,i));
        }
    }
    public abstract String makeALine(int h, int i); //추상 메서드
}
