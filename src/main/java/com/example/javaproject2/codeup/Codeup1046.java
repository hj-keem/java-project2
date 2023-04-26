package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        double average = (double)(num1+num2+num3)/3;

        System.out.printf("합 : %d\n", num1+num2+num3);
        System.out.printf("평균 : %.2f\n", average);
    }
}
