package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        String num3 = sc.next();

        int sum = Integer.parseInt(num1)+Integer.parseInt(num2)+Integer.parseInt(num3);
        float ave = (float)(sum/3);

        System.out.printf("%d\n", sum);
        System.out.printf("%.1f\n", ave);

//        -------double 혹은 float으로 강제 형변환------------
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int num3 = sc.nextInt();
//        double average = (float)(num1+num2+num3)/3;
//
//        System.out.printf("합 : %d\n", num1+num2+num3);
//        System.out.printf("평균 : %.2f\n", average);
    }
}
