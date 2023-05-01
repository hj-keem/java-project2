package com.example.javaproject2.codeup.code100;

import java.util.Scanner;
public class Codeup1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //합, 차, 곱, 몫, 나머지, 나눈 값
        String one = sc.next();
        String two = sc.next();

        int sum = Integer.parseInt(one)+Integer.parseInt(two);
        int min = Integer.parseInt(one)-Integer.parseInt(two);
        int xop = Integer.parseInt(one)*Integer.parseInt(two);
        int quo = Integer.parseInt(one)/Integer.parseInt(two);
        int rem = Integer.parseInt(one)%Integer.parseInt(two);
        float result = Float.parseFloat(one)/ Float.parseFloat(two);

        System.out.printf("%d\n", sum);
        System.out.printf("%d\n", min);
        System.out.printf("%d\n", xop);
        System.out.printf("%d\n", quo);
        System.out.printf("%d\n", rem);
        System.out.printf("%.2f", result);

// -------------double 혹은 float로 강제 형변환----------------------
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//
//        double quo = (float) num1 / num2;
//
//        System.out.printf("%d\n", num1 + num2);
//        System.out.printf("%d\n", num1 - num2);
//        System.out.printf("%d\n", num1 * num2);
//        System.out.printf("%d\n", num1 / num2);
//        System.out.printf("%d\n", num1 % num2);
//        System.out.printf("%.2f", quo);
    }
}
