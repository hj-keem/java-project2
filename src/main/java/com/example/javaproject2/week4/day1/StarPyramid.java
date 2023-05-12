package com.example.javaproject2.week4.day1;

public class StarPyramid {
    public static void main(String[] args) {
        int height = 4;

        for (int i = 0; i < height; i++) {
           // System.out.println(height - i - 1); //3210찍고 시작
            for (int j = 0 ; j < height-i-1 ; j++) { //height-i-1을 떠올려야 함.
                System.out.printf(" ");
            }
            for (int j = 0; j < 2*i+1; j++) { //2n+1
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
