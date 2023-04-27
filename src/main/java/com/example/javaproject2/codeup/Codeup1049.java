package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1049 {
    public static void main(String[] args) {
        //두 정수(a, b)를 입력받아
        //a가 b보다 크면 1을, a가 b보다 작거나 같으면 0을 출력하는 프로그램을 작성해보자.
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();

        System.out.println(iVal1 > iVal2 ? 1 : 0);
    }
}
