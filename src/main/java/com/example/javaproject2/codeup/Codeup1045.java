package com.example.javaproject2.codeup;

import java.util.Scanner;
public class Codeup1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //합, 차, 곱, 몫, 나머지, 나눈 값
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        double quo = (double) num1 / num2;

        System.out.printf("%d\n", num1 + num2);
        System.out.printf("%d\n", num1 - num2);
        System.out.printf("%d\n", num1 * num2);
        System.out.printf("%d\n", num1 / num2);
        System.out.printf("%d\n", num1 % num2);
        System.out.printf("%.2f", quo);
    }
}
