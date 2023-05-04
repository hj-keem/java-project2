package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt(); //시작
        long m = sc.nextInt(); //곱할 값
        long d = sc.nextInt(); //더할 값
        long n = sc.nextInt(); //몇번 째
        long result=a; //시작 값 설정

        for (int i = 1; i < n; i++) {
            result = (result * m )+d;
        }
        System.out.println(result);
    }
}
