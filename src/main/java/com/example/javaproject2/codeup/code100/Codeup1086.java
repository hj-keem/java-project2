package com.example.javaproject2.codeup.code100;

import java.util.Scanner;

public class Codeup1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long w = sc.nextLong();
        long h = sc.nextLong();
        long bit = sc.nextLong();

        double result = (double)(w * h * bit)/(8*1024*1024);

        System.out.printf("%.2f MB\n",result);

    }
}
