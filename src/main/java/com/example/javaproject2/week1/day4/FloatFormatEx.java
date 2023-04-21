package com.example.javaproject2.week1.day4;

import java.util.Scanner;

public class FloatFormatEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%f\n", 0.5);
        System.out.printf("%.2f\n", 1.444);
        System.out.printf("%.6f\n", 1.4);
        System.out.printf("%.1f\n", (sc.nextFloat() + sc.nextFloat() + sc.nextFloat()) / 3);
    }
}
